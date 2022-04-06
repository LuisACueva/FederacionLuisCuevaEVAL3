package entidades;

import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class Patrocinador {

	private long id;
	private String nombre;
	private String web;
	private double dotacion;

	private Collection<Prueba> pruebas;
	private Responsable representante;

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
}
