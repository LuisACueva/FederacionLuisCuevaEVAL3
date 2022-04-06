package entidades;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Responsable {

	private long id;
	private String telefonoProf;
	private LocalTime horarioIni;
	private LocalTime horarioFin;
	
	private DatosPersona persona;
	private Patrocinador patrocinador;
	
	public Patrocinador getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}
	public void setPersona(DatosPersona persona) {
		this.persona = persona;
	}
	public DatosPersona getPersona() {
		return persona;
	}
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
	
	public String data() {
		return "" + this.getId() + "|"+ persona.getId() + "|"  + this.getTelefonoProf() + "|"
				+ this.getHorarioIni().format(DateTimeFormatter.ofPattern("HH:mm")) + "|"
				+ this.getHorarioFin().format(DateTimeFormatter.ofPattern("HH:mm"));
	}
}
