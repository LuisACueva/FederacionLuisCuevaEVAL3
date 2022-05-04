package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Arrays;

import entidades.ComparadorAlfabetico;
import entidades.DatosPersona;
import entidades.Documentacion;
import utils.ConexBD;
import utils.Datos;

public class principal_LuisCueva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Commit prueba
		Connection conex = null;
		Statement consulta = null;
		ResultSet resultado = null;
		try {
			conex = ConexBD.establecerConexion();
			String consultaStr = "SELECT * FROM personas ORDER BY 2";
			if (conex == null)
				conex = ConexBD.getCon();
			consulta = conex.createStatement();
			resultado = consulta.executeQuery(consultaStr);
			while (resultado.next()) {
				int id = resultado.getInt(1);
				String nombre = resultado.getString(2);
				String telefono = resultado.getString(3);
				String nifnieS = resultado.getString(4);
				//Documentacion nifnie = new Documentacion();
				//No se puede declarar el nifnie y en la base de datos no hay fecha de nacimiento
				DatosPersona dp = new DatosPersona(id, nombre, telefono, LocalDate.now());
				
				String path = "atletas_alfabetico2.txt";
				File fichero = new File(path);
				FileWriter escritor = null;
				PrintWriter buffer = null;
				try {
					try {
						escritor = new FileWriter(fichero, false);
						buffer = new PrintWriter(escritor);
						buffer.println(dp.data());
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

	}
}
