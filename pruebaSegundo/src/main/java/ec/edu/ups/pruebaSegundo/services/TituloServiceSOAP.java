package ec.edu.ups.pruebaSegundo.services;

import java.sql.SQLException;
import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.pruebaSegundo.modelo.Persona;
import ec.edu.ups.pruebaSegundo.modelo.Titulo;
import ec.edu.ups.pruebaSegundo.negocio.TituloONLocal;


@WebService
public class TituloServiceSOAP {

	
	@Inject
	private TituloONLocal onTitulo;
	
	Persona per = new Persona();
	
	
	@WebMethod
	public Persona buscarPersona(String cedula) {
		Persona persona = null;
		
		try {
			persona = onTitulo.leerPersona(cedula);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			persona = null;
			persona = new Persona();
		}
		if (persona == null) {
			System.out.printf("Error", "No se encontro la cuenta");
			persona = new Persona();
		} else {
			per = persona;
		}
		return per;
	}
	
	@WebMethod
	public String insertTitulo(Titulo titulo) {
		try {
			Date fecha;
			titulo.setTituloId(onTitulo.tituloN());
			titulo.setFecha(fecha = new Date());
			onTitulo.crearTitulo(titulo);
			return "OK";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "Error";
		}
	}
}
