package ec.edu.ups.pruebaSegundo.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persona", schema ="public")
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name= "persona_id")
	private int personaId;
	private String cedula;
	private String nombre;
	public int getPersonaId() {
		return personaId;
	}
	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [personaId=" + personaId + ", cedula=" + cedula + ", nombre=" + nombre + "]";
	}
	
}
