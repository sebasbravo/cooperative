package ca.cooperative.inventario.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import ca.cooperative.inventario.model.Product;

public interface ProductRepository {

	List<Product> getAllProducts();

	Product getProductByCode(String codeProduct);

	List<Product> getProductsByCategory(int categoryId);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	List<Product> getProductsByIdManufacturer(int idManufacturer);

	void addProduct(Product product);

}
