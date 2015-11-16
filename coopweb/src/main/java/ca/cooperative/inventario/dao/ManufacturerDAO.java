package ca.cooperative.inventario.dao;

import java.util.List;

import ca.cooperative.inventario.model.Manufacturer;

public interface ManufacturerDAO extends GenericDAO<Manufacturer, Integer>{
	
	List<Manufacturer> findAll();

}
