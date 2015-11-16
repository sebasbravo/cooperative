package ca.cooperative.inventario.model;

public class Product {
	
	
	private String codeProduct;
	private String name;
	private String description;
	private Manufacturer manufacturer;
	private Category category;
	private Unit unit;
	private String condition;
	private String serial;
	private boolean actif;
	
	
	public Product() {
		super();
	}


	public String getCodeProduct() {
		return codeProduct;
	}


	public void setCodeProduct(String codeProduct) {
		this.codeProduct = codeProduct;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	


	public Unit getUnit() {
		return unit;
	}


	public void setUnit(Unit unit) {
		this.unit = unit;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public boolean isActif() {
		return actif;
	}


	public void setActif(boolean actif) {
		this.actif = actif;
	}


	public String getSerial() {
		return serial;
	}


	public void setSerial(String serial) {
		this.serial = serial;
	}

	
		
	

}
