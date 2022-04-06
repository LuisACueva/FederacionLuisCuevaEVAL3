package entidades;

import java.time.LocalTime;

public class Responsable {

	private long id;
	private String telefonoProf;
	private LocalTime horarioIni;
	private LocalTime horarioFin;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTelefonoProf() {
		return telefonoProf;
	}
	public void setTelefonoProf(String telefonoProf) {
		this.telefonoProf = telefonoProf;
	}
	public LocalTime getHorarioIni() {
		return horarioIni;
	}
	public void setHorarioIni(LocalTime horarioIni) {
		this.horarioIni = horarioIni;
	}
	public LocalTime getHorarioFin() {
		return horarioFin;
	}
	public void setHorarioFin(LocalTime horarioFin) {
		this.horarioFin = horarioFin;
	}
	
	public void importarRepresentantes() {
		
	}
}
