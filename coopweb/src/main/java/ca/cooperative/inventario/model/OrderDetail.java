package ca.cooperative.inventario.model;

public class OrderDetail {
	
	
	private Product product;
	private int quantity;
	
	
	public OrderDetail() {
		super();
	}


	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}




	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
