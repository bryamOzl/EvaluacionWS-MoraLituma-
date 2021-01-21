package ec.edu.ups.pruebaSegundo.negocio;

import java.sql.SQLException;

import javax.ejb.Local;

import ec.edu.ups.pruebaSegundo.modelo.Persona;
import ec.edu.ups.pruebaSegundo.modelo.Titulo;

@Local
public interface TituloONLocal {

	public boolean crearTitulo(Titulo titulo) throws Exception;
	public int tituloN () throws SQLException ;
	public Persona leerPersona(String cedula) throws SQLException;
}
