package entidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

import utils.ConexBD;
import utils.Datos;

public class Patrocinador implements operacionesCRUD<Patrocinador>{

	private long id;
	private String nombre;
	private String web;
	private double dotacion;

	private Collection<Prueba> pruebas;
	private Responsable responsable;
	
	public Patrocinador() {
		
	}
	
	public Patrocinador(long id, String nom, double dot, String web, long idR, String tlfR, LocalTime ltIR, LocalTime ltFR, DatosPersona dp) {
		this.id = id;
		this.nombre = nom;
		this.dotacion = dot;
		this.web = web;
		this.responsable.setId(idR);
		this.responsable.setTelefonoProf(tlfR);
		this.responsable.setHorarioIni(ltIR);
		this.responsable.setHorarioIni(ltFR);
		this.responsable.setPersona(dp);;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public Collection<Prueba> getPruebas() {
		return pruebas;
	}

	public void setPruebas(Collection<Prueba> pruebas) {
		this.pruebas = pruebas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public double getDotacion() {
		return dotacion;
	}

	public void setDotacion(double dotacion) {
		this.dotacion = dotacion;
	}

	public String mostrarBasico() {
		return "";
	}

	public String mostrarCompleto() {
		return "";
	}

	public String data() {
		return "" + this.getId() + "|" + this.getResponsable().getId() + "|" + this.getNombre() + "|"
				+ this.getDotacion() + "|" + this.getWeb();
	}

	@Override
	public boolean insertarConID(Patrocinador elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(Patrocinador elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Patrocinador buscarPorID(long id) {
		Connection conex = null;
		Statement consulta = null;
		ResultSet resultado = null;
		try {
			conex = ConexBD.establecerConexion();
			String consultaStr = "SELECT * FROM patrocinadores WHERE id ="+ id;
			if (conex == null)
				conex = ConexBD.getCon();
			consulta = conex.createStatement();
			resultado = consulta.executeQuery(consultaStr);
			while (resultado.next()) {
				int idP = resultado.getInt(1);
				String nombre = resultado.getString(2);
				String web = resultado.getString(3);
				double dotacion = resultado.getDouble(4);
				long persona = resultado.getInt(5);
				return new Patrocinador();
			}
		} catch (SQLException e) {
			System.out.println("Se ha producido una Excepcion:" + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Cerrando recursos...");
				if (resultado != null)
					resultado.close();
				if (consulta != null)
					consulta.close();
				if (conex != null)
					conex.close();
			} catch (SQLException e) {
				System.out.println("Se ha producido una Excepcion:" + e.getMessage());
				e.printStackTrace();
			}
		}
		return null;
	}
		
}
