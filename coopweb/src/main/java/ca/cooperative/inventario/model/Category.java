package ca.cooperative.inventario.model;

public class Category {
	
	private int categoryId;
	private String nameCategory;
	private String description;
	
	public Category() {
		super();
	}

	public Category(int categoryId, String nameCategory, String description) {
		super();
		this.categoryId = categoryId;
		this.nameCategory = nameCategory;
		this.description = description;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
