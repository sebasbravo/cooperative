package ca.cooperative.inventario.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import ca.cooperative.inventario.model.Category;
import ca.cooperative.inventario.model.Manufacturer;
import ca.cooperative.inventario.model.Product;



@Repository
public class InMemoryProductRepository implements ProductRepository {
	
	private List<Product> products = new ArrayList<Product>();
	
	

	public InMemoryProductRepository() {
		Category category = new Category(1, "Desengrasantes");
		Manufacturer manufacturer = new Manufacturer(1, "Micro");
		
		Product microOrange = new Product();
		microOrange.setCategory(category);
		microOrange.setCodeProduct("654504");
		microOrange.setName("Micro Orange");
		microOrange.setDescription("Desengrasante concentrado");
		microOrange.setCondition("nuevo");
		microOrange.setManufacturer(manufacturer);
		microOrange.setActif(true);
		
		Product astrolan = new Product();
		astrolan.setCategory(category);
		astrolan.setCodeProduct("63624R");
		astrolan.setName("Astrolan");
		astrolan.setDescription("Blanqueador");
		astrolan.setCondition("nuevo");
		astrolan.setManufacturer(manufacturer);
		astrolan.setActif(true);
		
		products.add(microOrange);
		products.add(astrolan);
		
	}

	@Override
	public List<Product> getAllProducts() {
		return products;
	}

	@Override
	public Product getProductByCode(String productCode) {
		Product productByCode = null;
		
		for (Product product : products) {
			if(product != null && product.getCodeProduct() != null && product.getCodeProduct().equals(productCode)){
				productByCode = product;
				break;
			}			
		}
		if(productByCode == null){
			throw new IllegalArgumentException("El codigo del producto no es valido:  "+productCode);
		}
		
		return productByCode;
	}

	@Override
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByIdManufacturer(int idManufacturer) {
		List<Product> productsByIdManufacturer = new ArrayList<>();
		
		for (Product product : products) {
			if(idManufacturer == product.getManufacturer().getIdManufacturer()){
				productsByIdManufacturer.add(product);
				
			}
		}
		
		return productsByIdManufacturer;
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public List<Product> getProductsByCategory(int categoryId) {
	List<Product> productsByCategory = new ArrayList<>();
		
		for (Product product : products) {
			if(categoryId == product.getCategory().getCategoryId()){
				productsByCategory.add(product);
				
			}
		}
		
		return productsByCategory;
	}

}
