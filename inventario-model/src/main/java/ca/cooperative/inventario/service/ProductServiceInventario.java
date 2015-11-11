package ca.cooperative.inventario.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.cooperative.inventario.model.Product;
import ca.cooperative.inventario.repository.ProductRepository;

@Service
public class ProductServiceInventario implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductByCode(String codeProduct) {
		return productRepository.getProductByCode(codeProduct);
	}

	@Override
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}

	@Override
	public List<Product> getProductsByIdManufacturer(int idManufacturer) {
		return productRepository.getProductsByIdManufacturer(idManufacturer);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);

	}

	@Override
	public List<Product> getProductsByCategory(int categoryId) {
		return productRepository.getProductsByCategory(categoryId);
	}

}
