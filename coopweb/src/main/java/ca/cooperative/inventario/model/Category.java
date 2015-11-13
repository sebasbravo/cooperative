package ca.cooperative.inventario.model;

public class Category {
	
	private int categoryId;
	private String nameCategory;
	
	public Category() {
		super();
	}

	public Category(int categoryId, String nameCategory) {
		super();
		this.categoryId = categoryId;
		this.nameCategory = nameCategory;
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
	
	
	
	

}
