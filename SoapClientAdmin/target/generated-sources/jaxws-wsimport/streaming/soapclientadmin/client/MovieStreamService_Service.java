
package streaming.soapclientadmin.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieStreamService", targetNamespace = "http://services.soapservice.streaming/", wsdlLocation = "http://localhost:39882/SoapService/MovieStreamService?wsdl")
public class MovieStreamService_Service
    extends Service
{

    private final static URL MOVIESTREAMSERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESTREAMSERVICE_EXCEPTION;
    private final static QName MOVIESTREAMSERVICE_QNAME = new QName("http://services.soapservice.streaming/", "MovieStreamService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:39882/SoapService/MovieStreamService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESTREAMSERVICE_WSDL_LOCATION = url;
        MOVIESTREAMSERVICE_EXCEPTION = e;
    }

    public MovieStreamService_Service() {
        super(__getWsdlLocation(), MOVIESTREAMSERVICE_QNAME);
    }

    public MovieStreamService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESTREAMSERVICE_QNAME, features);
    }

    public MovieStreamService_Service(URL wsdlLocation) {
        super(wsdlLocation, MOVIESTREAMSERVICE_QNAME);
    }

    public MovieStreamService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESTREAMSERVICE_QNAME, features);
    }

    public MovieStreamService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieStreamService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieStreamService
     */
    @WebEndpoint(name = "MovieStreamServicePort")
    public MovieStreamService getMovieStreamServicePort() {
        return super.getPort(new QName("http://services.soapservice.streaming/", "MovieStreamServicePort"), MovieStreamService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieStreamService
     */
    @WebEndpoint(name = "MovieStreamServicePort")
    public MovieStreamService getMovieStreamServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.soapservice.streaming/", "MovieStreamServicePort"), MovieStreamService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESTREAMSERVICE_EXCEPTION!= null) {
            throw MOVIESTREAMSERVICE_EXCEPTION;
        }
        return MOVIESTREAMSERVICE_WSDL_LOCATION;
    }

}
