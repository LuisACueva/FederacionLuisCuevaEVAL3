package main;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

import entidades.Patrocinador;

public class PrincipalExam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Patrocinador> patrocinadores = new ArrayList();
		
		patrocinadores.add(new Patrocinador(1, "ALSA", 500.00, "www.alsa.es", 1, "902422202", LocalTime.of(0, 0), LocalTime.of(23, 59), 1011));
		patrocinadores.add(new Patrocinador(2, "Ayto. Gijón", 250.00, "www.gijon.es", 2, "985181105", LocalTime.of(9, 0), LocalTime.of(18, 0), 1012));
		patrocinadores.add(new Patrocinador(3, "Universidad de Oviedo", 350.00, "www.uniovi.es", 3, "985103000", LocalTime.of(8, 30), LocalTime.of(20, 0), 1013));
		patrocinadores.add(new Patrocinador(4, "CIFP La Laboral", 255.99, "www.cifplalaboral.es", 4, "985185503", LocalTime.of(8, 30), LocalTime.of(18, 0), 1014));
	}

}
