package ca.cooperative.inventario.dao;

import java.util.List;

import ca.cooperative.inventario.model.Category;
import ca.cooperative.inventario.model.Manufacturer;
import ca.cooperative.inventario.model.Product;
import ca.cooperative.inventario.model.Unit;

public interface ProductDAO extends GenericDAO<Product, String>{
	
	List<Product> findAllProducts();
	List<Product> getProductsByCategory(Category category);
	List<Product> getProductsByUnit(Unit unit);
	List<Product> getProductsByManufacturer(Manufacturer manufacturer);
	
	

}
