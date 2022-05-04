package DAO;

import entidades.operacionesCRUD;
import utils.ConexBD;
import utils.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;

import entidades.Atleta;
import entidades.DatosPersona;
import entidades.Participante;
import entidades.Tiempo;

public class DAOparticipante implements operacionesCRUD<Participante> {

	Connection conex;

	public DAOparticipante(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}
	
	@Override
	public boolean insertarConID(Participante elemento) {
		boolean ret = false;

		String consultaInsertStr1 = "insert into participante(id, dorsal, calle, tiempo, penalizacion, otros) values (?,?,?,?,?,?)";
		
		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr1);
			pstmt.setLong(1, elemento.getId());
			pstmt.setLong(2, elemento.getDorsal());
			pstmt.setString(3, elemento.getCalle()+"");
			Time tiempo = Time.valueOf(LocalTime.of(elemento.getTiempo().getHoras(), elemento.getTiempo().getMinutos(), elemento.getTiempo().getSegundos(), elemento.getTiempo().getCentesimas()*10000000));
			pstmt.setTime(4, tiempo);
			pstmt.setBoolean(5, elemento.isPenalizacion());
			pstmt.setString(6, elemento.getOtros());
			int resultadoInsercion = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Se ha producido una SQLException:" + e.getMessage());
			e.printStackTrace();
			return false;
		}

		return ret;
	}

	@Override
	public long insertarSinID(Participante elemento) {
		long ret = -1;

		String consultaInsertStr1 = "insert into participante(dorsal, calle, tiempo, penalizacion, otros) values (?,?,?,?,?)";
		
		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr1);
			pstmt.setLong(1, elemento.getDorsal());
			pstmt.setString(2, elemento.getCalle()+"");
			Time tiempo = Time.valueOf(LocalTime.of(elemento.getTiempo().getHoras(), elemento.getTiempo().getMinutos(), elemento.getTiempo().getSegundos(), elemento.getTiempo().getCentesimas()*10000000));
			pstmt.setTime(3, tiempo);
			pstmt.setBoolean(4, elemento.isPenalizacion());
			pstmt.setString(5, elemento.getOtros());
			int resultadoInsercion = pstmt.executeUpdate();
			ret = elemento.getId();
		} catch (SQLException e) {
			System.out.println("Se ha producido una SQLException:" + e.getMessage());
			e.printStackTrace();
			
		}

		return ret;
	}

	@Override
	public Participante buscarPorID(long id) {
		Participante ret = null;
		String consultaInsertStr = "select * FROM participante WHERE id=?";
		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr);
			pstmt.setLong(1, id);
			ResultSet result = pstmt.executeQuery();
			while (result.next()) {
				long idBD = result.getLong("id");
				int dorsal = result.getInt("dorsal");
				char calle = result.getString("calle").toCharArray()[0]; //// puede ser null
				int horas = result.getTime("tiempo").toLocalTime().getHour();
				int minutos = result.getTime("tiempo").toLocalTime().getMinute();
				int segundos = result.getTime("tiempo").toLocalTime().getSecond();
				int centesimas = result.getTime("tiempo").toLocalTime().getNano()*10000000;
				Tiempo tiempo = new Tiempo(horas, minutos, segundos, centesimas);
				boolean penalizacion = result.getBoolean("penalizacion");
				String otros = result.getString("otros");
				ret = new Participante(idBD, dorsal, calle, tiempo, penalizacion, otros);
			}
			if (conex != null)
				conex.close();
		} catch (SQLException e) {
			System.out.println("Se ha producido una SQLException:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}

}
