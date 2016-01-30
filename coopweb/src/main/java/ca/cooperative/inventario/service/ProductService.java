package ca.cooperative.inventario.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import ca.cooperative.inventario.model.Category;
import ca.cooperative.inventario.model.Manufacturer;
import ca.cooperative.inventario.model.Product;
import ca.cooperative.inventario.model.Unit;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductByCode(String codeProduct);

	List<Product> getProductsByCategory(Category category);
	
	List<Product> getProductsByUnit(Unit unit);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	List<Product> getProductsByManufacturer(Manufacturer manufacturer);

	void addProduct(Product product);

     
}
