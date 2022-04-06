package entidades;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class Patrocinador implements operacionesCRUD<Patrocinador>{

	private long id;
	private String nombre;
	private String web;
	private double dotacion;

	private Collection<Prueba> pruebas;
	private Responsable representante;
	
	public Patrocinador() {
		
	}
	
	public Patrocinador(long id, String nom, double dot, String web, long idR, String tlfR, LocalTime ltIR, LocalTime ltFR, long idP) {
		this.id = id;
		this.nombre = nom;
		this.dotacion = dot;
		this.web = web;
		this.representante.setId(idR);
		this.representante.setTelefonoProf(tlfR);
		this.representante.setHorarioIni(ltIR);
		this.representante.setHorarioIni(ltFR);
		this.representante.getPersona().setId(idP);
	}

	public Responsable getRepresentante() {
		return representante;
	}

	public void setRepresentante(Responsable representante) {
		this.representante = representante;
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
		return "" + this.getId() + "|" + this.getRepresentante().getId() + "|" + this.getNombre() + "|"
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
		// TODO Auto-generated method stub
		return null;
	}
}
