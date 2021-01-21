package ec.edu.ups.pruebaSegundo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.pruebaSegundo.modelo.Titulo;

@Stateless
public class TituloDAO {

	@Inject
	private EntityManager em;

	@Inject
	private Connection con;
	
	public int contarTitulo() throws SQLException {
		int s;
		String sql = "SELECT MAX (titulo_Id) FROM Titulo";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		res.next();
		s = res.getInt(1) + 1;
		ps.execute();
		ps.close();
		return s;
	}
	
	public boolean insertTitulo(Titulo titulo) throws SQLException {
		em.persist(titulo);
		return true;
	}
}
