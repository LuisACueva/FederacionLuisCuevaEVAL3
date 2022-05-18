package entidades;

public class Tiempo {
	
	private int horas;
	private int minutos;
	private int segundos;
	private int centesimas;
	
	public Tiempo() {
		
	}
	
	public Tiempo(int h, int m, int s, int c) {
		horas = h;
		minutos = m;
		segundos = s;
		centesimas = c;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getCentesimas() {
		return centesimas;
	}

	public void setCentesimas(int centesimas) {
		this.centesimas = centesimas;
	}

	@Override
	public String toString() {
		return horas+":"+minutos+":"+segundos+","+centesimas;
	}
	
	public int compareTo(Tiempo o) {
		int ret = 0;
		ret = Integer.compare(this.getHoras(), o.getHoras());
		if (ret == 0) {
			ret = Integer.compare(this.getMinutos(), o.getMinutos());
			if (ret == 0) {
				ret = Integer.compare(this.getSegundos(), o.getSegundos());
				if (ret == 0) {
					ret = Integer.compare(this.getCentesimas(), o.getCentesimas());
				}
			}
		}

		return ret;
	}
}
