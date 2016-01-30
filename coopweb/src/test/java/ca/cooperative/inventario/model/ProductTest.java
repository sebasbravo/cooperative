package ca.cooperative.inventario.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ca.cooperative.inventario.repository.InMemoryProductRepository;

public class ProductTest {
	
	private static final String PRODUCT_CODE = "654504";
	
	private InMemoryProductRepository productRepository;
	
	
	@Before
	public void setup(){
		productRepository = new InMemoryProductRepository();
	}
	
	@Test
	public void testFindbyCode(){
		Product product = productRepository.getProductByCode(PRODUCT_CODE);
		assertNotNull(product);
		
	}
		
		
	

}
