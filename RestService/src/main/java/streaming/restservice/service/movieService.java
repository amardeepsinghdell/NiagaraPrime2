/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.restservice.service;

import java.math.BigDecimal;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import streaming.restservice.services.MovieStreamService;
import streaming.restservice.services.MovieStreamService_Service;
import streaming.restservice.services.Movies;

/**
 *
 * @author Bunny Gaming
 */
@Path("movieService")
@Produces("text/json")
public class movieService {
     @Path("all")
    @GET
    public Response getAll() {
        MovieStreamService_Service service = new MovieStreamService_Service();
        MovieStreamService port = service.getMovieStreamServicePort();
        List<Movies> mov = port.viewMovie();
        return Response.ok(mov).build();
    }
    
    @Path("all/{id}")
    @GET
    public Response getMovie(@PathParam("id") int id) {
        MovieStreamService_Service service = new MovieStreamService_Service();
        MovieStreamService port = service.getMovieStreamServicePort();
        Movies movs = port.findMovie(BigDecimal.valueOf(id));
        return Response.ok(movs).build();
    }
    
}

