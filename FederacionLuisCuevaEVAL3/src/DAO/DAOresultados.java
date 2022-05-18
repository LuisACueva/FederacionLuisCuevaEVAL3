package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;

import entidades.Resultado;
import entidades.operacionesCRUD;
import utils.ConexBD;

public class DAOresultados implements operacionesCRUD<Resultado> {

	Connection conex;

	public DAOresultados(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}
	
	
	@Override
	public boolean insertarConID(Resultado elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(Resultado elemento) {
		long ret = -1;

		String consultaInsertStr1 = "insert into resultados(definitivo, fechahora, idoro, idplata, idbronce, idpuesto1, idpuesto2, idpuesto3) values (?,?,?,?,?,?,?,?)";
		
		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr1);
			pstmt.setBoolean(1, elemento.isDefinitivo());
			java.sql.Date fechaSQL = java.sql.Date.valueOf(elemento.getFechahora().toLocalDate());
			pstmt.setDate(2, fechaSQL);
			pstmt.setLong(3, elemento.getPrimero().getId());
			pstmt.setLong(4, elemento.getSegundo().getId());
			pstmt.setLong(5, elemento.getTercero().getId());
			pstmt.setLong(6, elemento.getIdpodio()[0]);
			pstmt.setLong(7, elemento.getIdpodio()[1]);
			pstmt.setLong(8, elemento.getIdpodio()[2]);
			int resultadoInsercion = pstmt.executeUpdate();
			ret = elemento.getId();
		} catch (SQLException e) {
			System.out.println("Se ha producido una SQLException:" + e.getMessage());
			e.printStackTrace();
			
		}

		return ret;
	}

	@Override
	public Resultado buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
