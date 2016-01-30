package ca.cooperative.inventario.model;

public class Product {
	
	
	private String codeProduct;
	private String name;
	private String description;
	private Manufacturer manufacturer;
	private Category category;
	private String condition;
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

	
		
	

}
