package ca.cooperative.inventario.model;

import ca.cooperative.general.model.Company;

public class Supplier {
	
	private String codeSupplier;
	private Company company;
	
	public Supplier() {
		super();
	}

	public String getCodeSupplier() {
		return codeSupplier;
	}

	public void setCodeSupplier(String codeSupplier) {
		this.codeSupplier = codeSupplier;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	

}
