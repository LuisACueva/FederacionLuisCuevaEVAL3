package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entidades.DatosPersona;
import entidades.operacionesCRUD;
import utils.ConexBD;

public class DAOpersona implements operacionesCRUD<DatosPersona>{
	Connection conex;

	public DAOpersona(Connection c) {
		if (this.conex == null)
			conex = c;
	}
	@Override
	public boolean insertarConID(DatosPersona elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(DatosPersona elemento) {
		long ret = -1;

		String consultaInsertStr = "insert into personas(nombre, telefono, fechanac, nifnie) values (?,?,?,?)";
		try {
			if (this.conex == null || this.conex.isClosed())
				conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr);
			pstmt.setString(1, elemento.getNombre());
			pstmt.setString(2, elemento.getTelefono());
			pstmt.setDate(3, new java.sql.Date(elemento.getFechaNac().getYear(),elemento.getFechaNac().getMonthValue(),elemento.getFechaNac().getDayOfMonth()));
			pstmt.setString(4, elemento.getNifnie().mostrar());
			int resultadoInsercion = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("Se ha producido una SQLException:" + e.getMessage());
			e.printStackTrace();
			return -1;
		} catch (Exception e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
			return -1;
		}

		return ret;
	}

	@Override
	public DatosPersona buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
