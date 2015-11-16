package ca.cooperative.inventario.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.cooperative.inventario.model.Category;
import ca.cooperative.inventario.model.Manufacturer;
import ca.cooperative.inventario.model.Product;
import ca.cooperative.inventario.model.Unit;
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
	public List<Product> getProductsByManufacturer(Manufacturer manufacturer) {
		return productRepository.getProductsByManufacturer(manufacturer);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);

	}

	@Override
	public List<Product> getProductsByCategory(Category category) {
		return productRepository.getProductsByCategory(category);
	}

	@Override
	public List<Product> getProductsByUnit(Unit unit) {
		return productRepository.getProductsByUnit(unit);
	}

}
