
package streaming.restservice.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the streaming.restservice.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Movies_QNAME = new QName("http://services.soapservice.streaming/", "movies");
    private final static QName _UpdateMovieResponse_QNAME = new QName("http://services.soapservice.streaming/", "updateMovieResponse");
    private final static QName _FindMovie_QNAME = new QName("http://services.soapservice.streaming/", "findMovie");
    private final static QName _UpdateMovie_QNAME = new QName("http://services.soapservice.streaming/", "updateMovie");
    private final static QName _ViewMovie_QNAME = new QName("http://services.soapservice.streaming/", "viewMovie");
    private final static QName _DeleteMovie_QNAME = new QName("http://services.soapservice.streaming/", "deleteMovie");
    private final static QName _AddMovie_QNAME = new QName("http://services.soapservice.streaming/", "addMovie");
    private final static QName _AddMovieResponse_QNAME = new QName("http://services.soapservice.streaming/", "addMovieResponse");
    private final static QName _ViewMovieResponse_QNAME = new QName("http://services.soapservice.streaming/", "viewMovieResponse");
    private final static QName _DeleteMovieResponse_QNAME = new QName("http://services.soapservice.streaming/", "deleteMovieResponse");
    private final static QName _FindMovieResponse_QNAME = new QName("http://services.soapservice.streaming/", "findMovieResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: streaming.restservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Movies }
     * 
     */
    public Movies createMovies() {
        return new Movies();
    }

    /**
     * Create an instance of {@link UpdateMovieResponse }
     * 
     */
    public UpdateMovieResponse createUpdateMovieResponse() {
        return new UpdateMovieResponse();
    }

    /**
     * Create an instance of {@link FindMovie }
     * 
     */
    public FindMovie createFindMovie() {
        return new FindMovie();
    }

    /**
     * Create an instance of {@link UpdateMovie }
     * 
     */
    public UpdateMovie createUpdateMovie() {
        return new UpdateMovie();
    }

    /**
     * Create an instance of {@link ViewMovie }
     * 
     */
    public ViewMovie createViewMovie() {
        return new ViewMovie();
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link AddMovie }
     * 
     */
    public AddMovie createAddMovie() {
        return new AddMovie();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link ViewMovieResponse }
     * 
     */
    public ViewMovieResponse createViewMovieResponse() {
        return new ViewMovieResponse();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link FindMovieResponse }
     * 
     */
    public FindMovieResponse createFindMovieResponse() {
        return new FindMovieResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "movies")
    public JAXBElement<Movies> createMovies(Movies value) {
        return new JAXBElement<Movies>(_Movies_QNAME, Movies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "updateMovieResponse")
    public JAXBElement<UpdateMovieResponse> createUpdateMovieResponse(UpdateMovieResponse value) {
        return new JAXBElement<UpdateMovieResponse>(_UpdateMovieResponse_QNAME, UpdateMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "findMovie")
    public JAXBElement<FindMovie> createFindMovie(FindMovie value) {
        return new JAXBElement<FindMovie>(_FindMovie_QNAME, FindMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "updateMovie")
    public JAXBElement<UpdateMovie> createUpdateMovie(UpdateMovie value) {
        return new JAXBElement<UpdateMovie>(_UpdateMovie_QNAME, UpdateMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "viewMovie")
    public JAXBElement<ViewMovie> createViewMovie(ViewMovie value) {
        return new JAXBElement<ViewMovie>(_ViewMovie_QNAME, ViewMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "deleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<DeleteMovie>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "addMovie")
    public JAXBElement<AddMovie> createAddMovie(AddMovie value) {
        return new JAXBElement<AddMovie>(_AddMovie_QNAME, AddMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "viewMovieResponse")
    public JAXBElement<ViewMovieResponse> createViewMovieResponse(ViewMovieResponse value) {
        return new JAXBElement<ViewMovieResponse>(_ViewMovieResponse_QNAME, ViewMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "deleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<DeleteMovieResponse>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soapservice.streaming/", name = "findMovieResponse")
    public JAXBElement<FindMovieResponse> createFindMovieResponse(FindMovieResponse value) {
        return new JAXBElement<FindMovieResponse>(_FindMovieResponse_QNAME, FindMovieResponse.class, null, value);
    }

}
