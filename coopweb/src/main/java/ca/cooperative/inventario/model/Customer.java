package ca.cooperative.inventario.model;

import ca.cooperative.general.model.Company;
import ca.cooperative.general.model.Person;

public class Customer {
	
	private String customerCode;
	private Person person;
	private Company company;
	
	public Customer() {
		super();
	}

	public Customer(String customerCode, Person person) {
		super();
		this.customerCode = customerCode;
		this.person = person;
	}

	public Customer(String customerCode, Company company) {
		super();
		this.customerCode = customerCode;
		this.company = company;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
	

}
