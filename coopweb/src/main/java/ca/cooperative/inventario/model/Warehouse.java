package ca.cooperative.inventario.model;

import ca.cooperative.general.model.Address;

public class Warehouse {
	
	private String warehouseCode;
	private String name;
	private Address address;
	private String phone;
	private String cel;
	private String fax;
	private String contact;
	
	
	public Warehouse() {
		super();
	}


	public String getWarehouseCode() {
		return warehouseCode;
	}


	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCel() {
		return cel;
	}


	public void setCel(String cel) {
		this.cel = cel;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	

}
