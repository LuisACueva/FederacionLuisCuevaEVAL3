package entidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import utils.ConexBD;
import utils.Datos;
import utils.Utilidades;
import validaciones.Validaciones;

public class DatosPersona implements Comparable<DatosPersona>, Iterable<DatosPersona> {
	private long id;
	private String nombre;
	private String telefono;
	private LocalDate fechaNac;

	private Documentacion nifnie; //Examen 2 Ejercicio 3.2

	public DatosPersona(long id, String nombre, String telefono, LocalDate fechaNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
	}
	
	//Examen 2 Ejercicio 3.2
	public DatosPersona(long id, String nombre, String telefono, LocalDate fechaNac, Documentacion nifnie) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.nifnie = nifnie;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Documentacion getNifnie() {
		return nifnie;
	}

	public void setNifnie(Documentacion nifnie) {
		this.nifnie = nifnie;
	}

	@Override
	public String toString() {
		return nombre + " NIF/NIE: " + nifnie.mostrar() + " Tfn:" + telefono + " ("
				+ fechaNac.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
	
	public String data() {
		return "" + this.getId() + "|" 
				+ this.getNombre() + "|" 
				+ this.getTelefono() + "|"
				+ this.getFechaNac().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) 
				+ this.getNifnie().mostrar();
	}

	// Examen 2 Ejercicio 3.3
	// Examen 5 Ejercicio 3
	public static DatosPersona nuevaPersona() {
		DatosPersona ret = null;
		Scanner in;
		long id = -1;
		String nombre = "";
		String tfn = "";
		boolean valido = false;
		do {
			System.out.println("Introduzca el id de la nueva persona:");
			in = new Scanner(System.in);
			id = in.nextInt();
			valido = Validaciones.validarId(id);
			if (!valido)
				System.out.println("ERROR: Valor incorrecto para el identificador.");
			else
				valido = true;
		} while (!valido);
		valido = false;
		do {
			System.out.println("Introduzca el nombre de la nueva persona:");
			in = new Scanner(System.in);
			nombre = in.nextLine();
			valido = Validaciones.validarNombre(nombre);
			if (!valido)
				System.out.println("ERROR: El valor introducido para el nombre no es válido. ");
		} while (!valido);
		do {
			System.out.println("Introduzca el teléfono de la nueva persona:");
			in = new Scanner(System.in);
			tfn = in.nextLine();
			valido = Validaciones.validarTelefono(tfn);
			if (!valido)
				System.out.println("ERROR: El valor introducido para el teléfono no es válido. ");
		} while (!valido);
		System.out.println("Introduzca la fecha de nacimiento de la nueva persona");
		LocalDate fecha = Utilidades.leerFecha();
		System.out.println("¿Va a introducir un NIF? (pulse 'S' par SÍ o 'N' para NIE)");
		boolean esnif = Utilidades.leerBoolean();
		Documentacion doc;
		valido = false;
		do {
			if (esnif)
				doc = NIF.nuevoNIF();
			else
				doc = NIE.nuevoNIE();
			valido = doc.validar();
			if (!valido)
				System.out.println("ERROR: El documento introducido no es válido.");
		} while (!valido);
		ret = new DatosPersona(id, nombre, tfn, fecha, doc);
		return ret;
	}
	
	public static void exportar() {
		String path = "atletas_alfabetico.txt";
		File fichero = new File(path);
		FileWriter escritor = null;
		PrintWriter buffer = null;
		try {
			try {
				escritor = new FileWriter(fichero, false);
				buffer = new PrintWriter(escritor);
				Arrays.sort(Datos.PERSONAS, new ComparadorAlfabetico());
				for (DatosPersona m : Datos.PERSONAS) {
					buffer.println(m.data());
				}
			} finally {
				if (buffer != null) {
					buffer.close();
				}
				if (escritor != null) {
					escritor.close();
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Se ha producido una FileNotFoundException" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Se ha producido una IOException" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Se ha producido una Exception" + e.getMessage());
		}

	}

	@Override
	public int compareTo(DatosPersona o) {
		int ret = 0;
		if(this.getFechaNac().compareTo(o.getFechaNac()) == 0) {
			ret = this.getFechaNac().compareTo(o.getFechaNac());
		}else {
			ret = this.getNifnie().compareTo(o.getNifnie());
		}
		return ret;
	}
	
	public static void insertarPersonas() {
//		LinkedList<DatosPersona> tree = new LinkedList<>();
//		Iterator<DatosPersona> itr = tree.iterator();
//		
//		for(DatosPersona m: Datos.PERSONAS) {
//			tree.add(m);
//		}
//		
//		while(itr.hasNext()) {
//			Connection conex = ConexBD.establecerConexion();
//			String consultaInsertStr = "insert into lugares(id, nombre, telefono, nifnie) values (?,?,?,?)";
//			try {
//				PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr);
//				for (DatosPersona l : Datos.PERSONAS) {
//					pstmt.setLong(1, l.getId());
//					pstmt.setString(2, l.getNombre());
//					pstmt.setString(3, l.getTelefono());
//					pstmt.setString(4, l.getNifnie().mostrar());
//					int resultadoInsercion = pstmt.executeUpdate();
//				}
//
//			} catch (SQLException e) {
//				System.out.println("Se ha producido una SQLException:" + e.getMessage());
//				e.printStackTrace();
//			}
//		}
	}

	@Override
	public java.util.Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
