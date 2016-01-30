package ca.cooperative.general.model;

public class Address {
	
	private int addressId;
	private PostalCode postalCode;
	
	
	public Address() {
		super();
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public PostalCode getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	

}
