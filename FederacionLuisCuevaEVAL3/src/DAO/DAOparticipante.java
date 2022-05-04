package DAO;

import entidades.operacionesCRUD;

import java.sql.Connection;

import entidades.Participante;

public class DAOparticipante implements operacionesCRUD<Participante> {

	Connection conex;

	public DAOparticipante(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}
	
	@Override
	public boolean insertarConID(Participante elemento) {
		// TODO Auto-generated method stub
		return false;
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
