/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.soapclientadmin.servlets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Base64;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.xml.rpc.soap.SOAPFaultException;
import streaming.soapclientadmin.client.MovieStreamService;
import streaming.soapclientadmin.client.MovieStreamService_Service;
import streaming.soapclientadmin.client.Movies;

/**
 *
 * @author Bunny Gaming
 */
@WebServlet(name = "Display", urlPatterns = {"/DisplayServlet"})
@MultipartConfig
public class Display extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Display</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Display at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.loadMovies(request);
        RequestDispatcher dispacher = request.getRequestDispatcher("/list.jsp");
        dispacher.forward(request, response);
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {

        String addAMovie = request.getParameter("addmovie");
        String deleteAMovie = request.getParameter("deleteid");
        String updateDisplayPage = request.getParameter("updateid");
        String updateAMovie = request.getParameter("updatemovie");
        String addNewMovie = request.getParameter("addnewmov");
        String viewAllMovies = request.getParameter("viewlist");

        HttpSession session = request.getSession();

        MovieStreamService_Service service = new MovieStreamService_Service();
        MovieStreamService port = service.getMovieStreamServicePort();

        if (addAMovie != null || updateAMovie != null) {
            String title = request.getParameter("title");
            String desc = request.getParameter("desc");
            String prod = request.getParameter("prod");
            String director = request.getParameter("dir");
            String category = request.getParameter("cat");
            
            Long rate = Long.valueOf(Integer.parseInt(request.getParameter("rate")));
            BigDecimal id = BigDecimal.valueOf(Integer.parseInt(request.getParameter("id")));
           try{
               loadIds(request,id);
           }
           catch(SQLIntegrityConstraintViolationException e)
           {
           request.setAttribute("imageError", "This id already exists, please try another");
           RequestDispatcher dispacher = request.getRequestDispatcher("/addMovie.jsp");
            dispacher.forward(request, response);
           }
            Movies mov = new Movies();
            mov.setTitle(title);
            mov.setDescription(desc);
            mov.setProducer(prod);
            mov.setDirector(director);
            mov.setCategory(category);
            mov.setRating(rate);
            mov.setId(id);

            try {
                Part part = request.getPart("thumbnail");
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                InputStream filecontent = part.getInputStream();
                byte[] buffer = new byte[(int) part.getSize()];
                int read = 0;
                while ((read = filecontent.read(buffer)) != -1) {
                    bytes.write(buffer, 0, read);
                }
                mov.setThumb(buffer);
                if (addAMovie != null) {
                    port.addMovie(mov);
                } else {
                    int movieId = (int) session.getAttribute("movieId");
                    mov.setId(BigDecimal.valueOf(movieId));
                    port.updateMovie(mov);
                }
//            } catch (SOAPFaultException ex) {
////                this.loadMovies(request);
//                request.setAttribute("handlerError", "Sorry! Cannot add a show with the name 'Disney' in any field.");
//                System.err.println("Sorry! Cannot add a show with the name 'Disney' in any field.");
//                RequestDispatcher dispacher = request.getRequestDispatcher("/addMovie.jsp");
//                dispacher.forward(request, response);
//            } 
//         
            this.loadMovies(request);
            RequestDispatcher dispacher = request.getRequestDispatcher("/list.jsp");
            dispacher.forward(request, response);
            }            
            catch (Exception ex) {
                request.setAttribute("imageError", ex.getMessage());
                RequestDispatcher dispacher = request.getRequestDispatcher("/addMovie.jsp");
                dispacher.forward(request, response);
            }
            
           
        }

        if (deleteAMovie != null) {
            int movId = Integer.parseInt(deleteAMovie);
            port.deleteMovie(BigDecimal.valueOf(movId));
            this.loadMovies(request);
            RequestDispatcher dispacher = request.getRequestDispatcher("/list.jsp");
            dispacher.forward(request, response);
        }

        if (updateDisplayPage != null) {
            int movId = Integer.parseInt(updateDisplayPage);
            Movies mov = port.findMovie(BigDecimal.valueOf(movId));
            byte[] imageData = mov.getThumb();
            String base64Image = Base64.getEncoder().encodeToString(imageData);
            request.setAttribute("uploadedImg", base64Image);
            session.setAttribute("movieId", movId);
            request.setAttribute("movie", mov);
            //this.loadTypeCategoryFields(request);
            request.setAttribute("disableUpdateBtn", "false");
            RequestDispatcher dispacher = request.getRequestDispatcher("/updateMovie.jsp");
            dispacher.forward(request, response);
        }

        if (addNewMovie != null) {
            // this.loadTypeCategoryFields(request);
            request.setAttribute("disableUpdateBtn", "true");
            RequestDispatcher dispacher = request.getRequestDispatcher("/addMovie.jsp");
            dispacher.forward(request, response);
        }

        if (viewAllMovies != null) {
            this.loadMovies(request);
            RequestDispatcher dispacher = request.getRequestDispatcher("/list.jsp");
            dispacher.forward(request, response);
        }

        processRequest(request, response);
    }
    
    private void loadMovies(HttpServletRequest request) {
        MovieStreamService_Service service = new MovieStreamService_Service();
        MovieStreamService port = service.getMovieStreamServicePort();
        List<Movies> movies = port.viewMovie();
        request.setAttribute("movies", movies);
    }
        private void loadIds(HttpServletRequest request,BigDecimal id) throws SQLIntegrityConstraintViolationException {
        MovieStreamService_Service service = new MovieStreamService_Service();
        MovieStreamService port = service.getMovieStreamServicePort();
         Movies mov = port.findMovie(id);
        if(mov != null)
        {
        throw new SQLIntegrityConstraintViolationException();
        }
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
