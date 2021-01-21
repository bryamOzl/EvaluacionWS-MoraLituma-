
package ec.ups.edu.pruebaSegundo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para titulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="titulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTirulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nombreTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persona" type="{http://services.pruebaSegundo.ups.edu.ec/}persona" minOccurs="0"/>
 *         &lt;element name="tituloId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="universidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titulo", propOrder = {
    "codigoTirulo",
    "fecha",
    "nombreTitulo",
    "persona",
    "tituloId",
    "universidad"
})
public class Titulo {

    protected String codigoTirulo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected String nombreTitulo;
    protected Persona persona;
    protected int tituloId;
    protected String universidad;

    /**
     * Obtiene el valor de la propiedad codigoTirulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTirulo() {
        return codigoTirulo;
    }

    /**
     * Define el valor de la propiedad codigoTirulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTirulo(String value) {
        this.codigoTirulo = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitulo() {
        return nombreTitulo;
    }

    /**
     * Define el valor de la propiedad nombreTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitulo(String value) {
        this.nombreTitulo = value;
    }

    /**
     * Obtiene el valor de la propiedad persona.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Define el valor de la propiedad persona.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(Persona value) {
        this.persona = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloId.
     * 
     */
    public int getTituloId() {
        return tituloId;
    }

    /**
     * Define el valor de la propiedad tituloId.
     * 
     */
    public void setTituloId(int value) {
        this.tituloId = value;
    }

    /**
     * Obtiene el valor de la propiedad universidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     * Define el valor de la propiedad universidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversidad(String value) {
        this.universidad = value;
    }

}
