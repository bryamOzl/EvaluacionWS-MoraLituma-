package ec.edu.ups.pruebaSegundo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pruebaSegundo.modelo.Persona;


@Stateless
public class PersonaDao {

	@Inject
	private Connection con;
	
	public Persona buscarPersona(String cedula) throws SQLException {
		Persona persona = new Persona();
		String sql = "SELECT * FROM Persona WHERE  cedula=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cedula);
		ResultSet res = ps.executeQuery();
		res.next();
		persona.setPersonaId(res.getInt("persona_id"));
		persona.setCedula(res.getString("cedula"));
		persona.setNombre(res.getString("nombre"));
		ps.execute();
		ps.close();
		return persona;
	}
}
