package DAO;

import entidades.operacionesCRUD;
import utils.ConexBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;

import entidades.Participante;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Participante buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
