
package ec.ups.edu.pruebaSegundo;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2021-01-20T20:36:15.663-05:00
 * Generated source version: 2.7.9
 * 
 */
public final class TituloServiceSOAP_TituloServiceSOAPPort_Client {

    private static final QName SERVICE_NAME = new QName("http://services.pruebaSegundo.ups.edu.ec/", "TituloServiceSOAPService");

    private TituloServiceSOAP_TituloServiceSOAPPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TituloServiceSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TituloServiceSOAPService ss = new TituloServiceSOAPService(wsdlURL, SERVICE_NAME);
        TituloServiceSOAP port = ss.getTituloServiceSOAPPort();  
        
        {
        System.out.println("Invoking buscarPersona...");
        java.lang.String _buscarPersona_arg0 = "";
        ec.ups.edu.pruebaSegundo.Persona _buscarPersona__return = port.buscarPersona(_buscarPersona_arg0);
        System.out.println("buscarPersona.result=" + _buscarPersona__return);


        }
        {
        System.out.println("Invoking insertTitulo...");
        ec.ups.edu.pruebaSegundo.Titulo _insertTitulo_arg0 = null;
        java.lang.String _insertTitulo__return = port.insertTitulo(_insertTitulo_arg0);
        System.out.println("insertTitulo.result=" + _insertTitulo__return);


        }

        System.exit(0);
    }

}
