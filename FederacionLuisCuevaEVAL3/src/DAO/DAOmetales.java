package DAO;

import java.sql.Connection;

import entidades.Metal;

import entidades.operacionesCRUD;

public class DAOmetales implements operacionesCRUD<Metal> {
	//DAO
	Connection conex;

	public DAOmetales(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}
	
	@Override
	public boolean insertarConID(Metal elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(Metal elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Metal buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
