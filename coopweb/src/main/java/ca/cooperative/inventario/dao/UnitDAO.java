package ca.cooperative.inventario.dao;

import java.util.List;

import ca.cooperative.inventario.model.Unit;

public interface UnitDAO extends GenericDAO<Unit, Integer>{
	
	List<Unit> findAll();

}
