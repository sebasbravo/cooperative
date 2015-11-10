package ca.cooperative.inventario.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import ca.cooperative.inventario.model.product.Product;



public interface ProductRepository {
	
	List<Product> getAllProducts();
	Product getProductByCode(String productId); 
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	List<Product> getProductsByManufacturer(String manufacturer);
	void addProduct(Product product);

}
