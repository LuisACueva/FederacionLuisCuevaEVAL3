package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import entidades.Atleta;
import entidades.DatosPersona;
import entidades.Equipo;
import entidades.operacionesCRUD;
import utils.ConexBD;
import utils.Datos;

public class DAOequipo implements operacionesCRUD<Equipo>{
	Connection conex;

	public DAOequipo(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}
	
	@Override
	public boolean insertarConID(Equipo elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(Equipo elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Equipo buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Equipo> buscarTodos() {
		List<Equipo> todos = new ArrayList<>();
		String consultaInsertStr = "select * FROM equipos";
		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr);
			ResultSet result = pstmt.executeQuery();
			while (result.next()) {
				Equipo equipo;
				long idBD = result.getLong("id");
				
				
				equipo = new Equipo();
				equipo.setId(idBD);
				
				todos.add(equipo);
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
		return todos;
	}

}