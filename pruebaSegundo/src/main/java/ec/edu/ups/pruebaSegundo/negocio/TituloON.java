package ec.edu.ups.pruebaSegundo.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pruebaSegundo.DAO.PersonaDao;
import ec.edu.ups.pruebaSegundo.DAO.TituloDAO;
import ec.edu.ups.pruebaSegundo.modelo.Persona;
import ec.edu.ups.pruebaSegundo.modelo.Titulo;

@Stateless
public class TituloON implements TituloONLocal{
	
	@Inject
	private TituloDAO daoTitulo;
	
	@Inject
	private PersonaDao daoPersona;
	
	Persona persona = new Persona();
	
	public boolean crearTitulo(Titulo titulo) throws Exception {
		if (titulo == null)
			throw new Exception("Error en el Objeto Titulo");
		try {
			daoTitulo.insertTitulo(titulo);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al Ingresar el Titulo");
		}
		return true;
	}
	
	public int tituloN () throws SQLException {
		int id= daoTitulo.contarTitulo();
		return id;
	}
	
	public Persona leerPersona(String cedula) throws SQLException {
		persona = daoPersona.buscarPersona(cedula);
		return persona;
	}

}
