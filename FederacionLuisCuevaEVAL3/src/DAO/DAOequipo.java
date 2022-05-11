package DAO;

import entidades.Equipo;
import entidades.operacionesCRUD;

public class DAOequipo implements operacionesCRUD<Equipo>{

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

}
