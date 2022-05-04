package DAO;

import java.sql.Connection;

import entidades.Resultado;
import entidades.operacionesCRUD;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Resultado buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
