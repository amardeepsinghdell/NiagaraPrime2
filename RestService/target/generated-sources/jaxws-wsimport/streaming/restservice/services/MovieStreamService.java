
package streaming.restservice.services;

import java.math.BigDecimal;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MovieStreamService", targetNamespace = "http://services.soapservice.streaming/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieStreamService {


    /**
     * 
     * @param moviesAdd
     * @return
     *     returns streaming.restservice.services.Movies
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.AddMovieResponse")
    @Action(input = "http://services.soapservice.streaming/MovieStreamService/addMovieRequest", output = "http://services.soapservice.streaming/MovieStreamService/addMovieResponse")
    public Movies addMovie(
        @WebParam(name = "moviesAdd", targetNamespace = "")
        Movies moviesAdd);

    /**
     * 
     * @param deleteMovie
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMovie", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.DeleteMovie")
    @ResponseWrapper(localName = "deleteMovieResponse", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.DeleteMovieResponse")
    @Action(input = "http://services.soapservice.streaming/MovieStreamService/deleteMovieRequest", output = "http://services.soapservice.streaming/MovieStreamService/deleteMovieResponse")
    public boolean deleteMovie(
        @WebParam(name = "deleteMovie", targetNamespace = "")
        BigDecimal deleteMovie);

    /**
     * 
     * @param updateMovie
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateMovie", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.UpdateMovie")
    @ResponseWrapper(localName = "updateMovieResponse", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.UpdateMovieResponse")
    @Action(input = "http://services.soapservice.streaming/MovieStreamService/updateMovieRequest", output = "http://services.soapservice.streaming/MovieStreamService/updateMovieResponse")
    public boolean updateMovie(
        @WebParam(name = "updateMovie", targetNamespace = "")
        Movies updateMovie);

    /**
     * 
     * @return
     *     returns java.util.List<streaming.restservice.services.Movies>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewMovie", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.ViewMovie")
    @ResponseWrapper(localName = "viewMovieResponse", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.ViewMovieResponse")
    @Action(input = "http://services.soapservice.streaming/MovieStreamService/viewMovieRequest", output = "http://services.soapservice.streaming/MovieStreamService/viewMovieResponse")
    public List<Movies> viewMovie();

    /**
     * 
     * @param arg0
     * @return
     *     returns streaming.restservice.services.Movies
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMovie", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.FindMovie")
    @ResponseWrapper(localName = "findMovieResponse", targetNamespace = "http://services.soapservice.streaming/", className = "streaming.restservice.services.FindMovieResponse")
    @Action(input = "http://services.soapservice.streaming/MovieStreamService/findMovieRequest", output = "http://services.soapservice.streaming/MovieStreamService/findMovieResponse")
    public Movies findMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0);

}
