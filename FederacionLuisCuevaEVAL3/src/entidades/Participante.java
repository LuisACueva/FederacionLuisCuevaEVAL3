package entidades;

import java.util.Scanner;

public class Participante {
	protected long id;
	protected int dorsal; // valor entre 001 y 150
	protected char calle;
	private Tiempo tiempo;
	private boolean penalizacion = false;
	private String otros;

	public Participante(long id, int dorsal, char calle) {
		super();
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
	}
	
	public Participante(long id, int dorsal, char calle, Tiempo tie, boolean pen, String otr) {
		super();
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
		this.tiempo = tie;
		this.penalizacion = pen;
		if (penalizacion)
			this.otros = otr;
	}

	public Tiempo getTiempo() {
		return tiempo;
	}

	public void setTiempo(Tiempo tiempo) {
		this.tiempo = tiempo;
	}

	public boolean isPenalizacion() {
		return penalizacion;
	}

	public void setPenalizacion(boolean penalizacion) {
		this.penalizacion = penalizacion;
		Scanner sc = new Scanner(System.in);
		if (penalizacion) {
			this.otros = sc.next();
		}else {
			this.otros = null;
		}
	}

	public String getOtros() {
		return otros;
	}

	public void setOtros(String otros) {
		this.otros = otros;
	}

	public Participante() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public char getCalle() {
		return calle;
	}

	public void setCalle(char calle) {
		this.calle = calle;
	}

	@Override
	public String toString() {
		return "Participante [id=" + id + ", dorsal=" + dorsal + ", calle=" + calle + ", tiempo=" + tiempo
				+ ", penalizacion=" + penalizacion + ", otros=" + otros + "]";
	}
}
