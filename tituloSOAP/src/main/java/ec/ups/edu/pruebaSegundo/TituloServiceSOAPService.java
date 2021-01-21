package ec.ups.edu.pruebaSegundo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2021-01-20T20:36:15.785-05:00
 * Generated source version: 2.7.9
 * 
 */
@WebServiceClient(name = "TituloServiceSOAPService", 
                  wsdlLocation = "file:/C:/Users/Bryam/AppData/Local/Temp/tempdir8965016840788121178.tmp/TituloServiceSOAP_1.wsdl",
                  targetNamespace = "http://services.pruebaSegundo.ups.edu.ec/") 
public class TituloServiceSOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.pruebaSegundo.ups.edu.ec/", "TituloServiceSOAPService");
    public final static QName TituloServiceSOAPPort = new QName("http://services.pruebaSegundo.ups.edu.ec/", "TituloServiceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Bryam/AppData/Local/Temp/tempdir8965016840788121178.tmp/TituloServiceSOAP_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TituloServiceSOAPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Bryam/AppData/Local/Temp/tempdir8965016840788121178.tmp/TituloServiceSOAP_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TituloServiceSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TituloServiceSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TituloServiceSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TituloServiceSOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TituloServiceSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TituloServiceSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TituloServiceSOAP
     */
    @WebEndpoint(name = "TituloServiceSOAPPort")
    public TituloServiceSOAP getTituloServiceSOAPPort() {
        return super.getPort(TituloServiceSOAPPort, TituloServiceSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TituloServiceSOAP
     */
    @WebEndpoint(name = "TituloServiceSOAPPort")
    public TituloServiceSOAP getTituloServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(TituloServiceSOAPPort, TituloServiceSOAP.class, features);
    }

}
