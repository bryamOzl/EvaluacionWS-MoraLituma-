
package ec.ups.edu.pruebaSegundo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.ups.edu.pruebaSegundo package. 
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

    private final static QName _InsertTitulo_QNAME = new QName("http://services.pruebaSegundo.ups.edu.ec/", "insertTitulo");
    private final static QName _BuscarPersona_QNAME = new QName("http://services.pruebaSegundo.ups.edu.ec/", "buscarPersona");
    private final static QName _BuscarPersonaResponse_QNAME = new QName("http://services.pruebaSegundo.ups.edu.ec/", "buscarPersonaResponse");
    private final static QName _InsertTituloResponse_QNAME = new QName("http://services.pruebaSegundo.ups.edu.ec/", "insertTituloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.ups.edu.pruebaSegundo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarPersona }
     * 
     */
    public BuscarPersona createBuscarPersona() {
        return new BuscarPersona();
    }

    /**
     * Create an instance of {@link BuscarPersonaResponse }
     * 
     */
    public BuscarPersonaResponse createBuscarPersonaResponse() {
        return new BuscarPersonaResponse();
    }

    /**
     * Create an instance of {@link InsertTituloResponse }
     * 
     */
    public InsertTituloResponse createInsertTituloResponse() {
        return new InsertTituloResponse();
    }

    /**
     * Create an instance of {@link InsertTitulo }
     * 
     */
    public InsertTitulo createInsertTitulo() {
        return new InsertTitulo();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Titulo }
     * 
     */
    public Titulo createTitulo() {
        return new Titulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pruebaSegundo.ups.edu.ec/", name = "insertTitulo")
    public JAXBElement<InsertTitulo> createInsertTitulo(InsertTitulo value) {
        return new JAXBElement<InsertTitulo>(_InsertTitulo_QNAME, InsertTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pruebaSegundo.ups.edu.ec/", name = "buscarPersona")
    public JAXBElement<BuscarPersona> createBuscarPersona(BuscarPersona value) {
        return new JAXBElement<BuscarPersona>(_BuscarPersona_QNAME, BuscarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pruebaSegundo.ups.edu.ec/", name = "buscarPersonaResponse")
    public JAXBElement<BuscarPersonaResponse> createBuscarPersonaResponse(BuscarPersonaResponse value) {
        return new JAXBElement<BuscarPersonaResponse>(_BuscarPersonaResponse_QNAME, BuscarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTituloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pruebaSegundo.ups.edu.ec/", name = "insertTituloResponse")
    public JAXBElement<InsertTituloResponse> createInsertTituloResponse(InsertTituloResponse value) {
        return new JAXBElement<InsertTituloResponse>(_InsertTituloResponse_QNAME, InsertTituloResponse.class, null, value);
    }

}
