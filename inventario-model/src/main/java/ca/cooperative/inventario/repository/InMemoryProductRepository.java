package ca.cooperative.inventario.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import ca.cooperative.inventario.model.Manufacturer;
import ca.cooperative.inventario.model.Product;
import ca.cooperative.inventario.model.ProductType;


@Repository
public class InMemoryProductRepository implements ProductRepository {
	
	private List<Product> products = new ArrayList<Product>();
	
	

	public InMemoryProductRepository() {
		ProductType type = new ProductType(1, "Desengrasantes");
		Manufacturer manufacturer = new Manufacturer(1, "Micro");
		
		Product microOrange = new Product();
		microOrange.setProductType(type);
		microOrange.setCodeProduct("654504");
		microOrange.setName("Micro Orange");
		microOrange.setDescription("Desengrasante concentrado");
		microOrange.setCondition("nuevo");
		microOrange.setManufacturer(manufacturer);
		microOrange.setActif(true);
		
		Product astrolan = new Product();
		astrolan.setProductType(type);
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
	public Product getProductByCode(String productId) {
		Product productCode = null;
		
		for (Product product : products) {
			if(product != null && product.getCodeProduct() != null && product.getCodeProduct().equals(productCode)){
				productCode = product;
				break;
			}
			
		}
		return productCode;
	}

	@Override
	public List<Product> getProductsByIdType(int idType) {
		List<Product> productsByType = new ArrayList<>();
		
		for (Product product : products) {
			if(idType == product.getProductType().getIdProductType()){
				productsByType.add(product);
				
			}
		}
		
		return productsByType;
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

}
