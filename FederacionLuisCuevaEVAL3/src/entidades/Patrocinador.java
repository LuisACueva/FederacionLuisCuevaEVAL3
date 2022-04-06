package entidades;

public class Patrocinador {
	
	private long id;
	private String nombre;
	private String web;
	private double dotacion;
	
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
}
