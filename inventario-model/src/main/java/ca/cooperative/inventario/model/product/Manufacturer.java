package ca.cooperative.inventario.model.product;

public class Manufacturer {
	
	private int idManufacturer;
	private String name;
	
	
	
	public Manufacturer() {
		super();
	}



	public Manufacturer(int idManufacturer, String name) {
		super();
		this.idManufacturer = idManufacturer;
		this.name = name;
	}



	public int getIdManufacturer() {
		return idManufacturer;
	}



	public void setIdManufacturer(int idManufacturer) {
		this.idManufacturer = idManufacturer;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	

}
