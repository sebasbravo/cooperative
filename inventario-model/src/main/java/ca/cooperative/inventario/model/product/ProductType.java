package ca.cooperative.inventario.model.product;

public class ProductType {
	
	private int idProductType;
	private String name;
	
	
	
	public ProductType() {
		super();
	}



	public ProductType(int idProductType, String name) {
		super();
		this.idProductType = idProductType;
		this.name = name;
	}



	public int getIdProductType() {
		return idProductType;
	}



	public void setIdProductType(int idProductType) {
		this.idProductType = idProductType;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
