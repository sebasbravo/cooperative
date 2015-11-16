package ca.cooperative.inventario.dao;

import java.util.List;

import ca.cooperative.inventario.model.Category;

public interface CategoryDAO extends GenericDAO<Category, Integer>{
	
	List<Category> findAll();

}
