package ec.edu.ups.pruebaSegundo.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Titulo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name= "titulo_id")
	private int tituloId;
	private String codigoTirulo;
	private String nombreTitulo;
	private String universidad;
	private Date fecha;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="persona_id")
	private Persona persona;

	public int getTituloId() {
		return tituloId;
	}

	public void setTituloId(int tituloId) {
		this.tituloId = tituloId;
	}

	public String getCodigoTirulo() {
		return codigoTirulo;
	}

	public void setCodigoTirulo(String codigoTirulo) {
		this.codigoTirulo = codigoTirulo;
	}

	public String getNombreTitulo() {
		return nombreTitulo;
	}

	public void setNombreTitulo(String nombreTitulo) {
		this.nombreTitulo = nombreTitulo;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Titulo [tituloId=" + tituloId + ", codigoTirulo=" + codigoTirulo + ", nombreTitulo=" + nombreTitulo
				+ ", universidad=" + universidad + ", fecha=" + fecha + ", persona=" + persona + "]";
	}

}
