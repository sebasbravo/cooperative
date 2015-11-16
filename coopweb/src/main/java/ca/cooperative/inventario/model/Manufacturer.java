package ca.cooperative.inventario.model;

public class Manufacturer {
	
	private int idManufacturer;
	private String name;
	private String decription;
	
	
	
	public Manufacturer() {
		super();
	}



	public Manufacturer(int idManufacturer, String name, String decription) {
		super();
		this.idManufacturer = idManufacturer;
		this.name = name;
		this.decription = decription;
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



	public String getDecription() {
		return decription;
	}



	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	
	

}
