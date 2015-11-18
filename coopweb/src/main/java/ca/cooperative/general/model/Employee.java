package ca.cooperative.general.model;

import java.time.LocalDate;

import javax.imageio.stream.FileImageInputStream;

public class Employee {
	
	private String employeeCode;
	private Person person;
	private String title;
	private boolean member;
	private LocalDate dateOfBirth;
	private LocalDate hireDate;
	private Address address;
	private String phoneCompany;
	private String celCompany;
	private String emailCompany;
	private FileImageInputStream photo;
	
	public Employee() {
		super();
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneCompany() {
		return phoneCompany;
	}

	public void setPhoneCompany(String phoneCompany) {
		this.phoneCompany = phoneCompany;
	}

	public String getCelCompany() {
		return celCompany;
	}

	public void setCelCompany(String celCompany) {
		this.celCompany = celCompany;
	}

	public String getEmailCompany() {
		return emailCompany;
	}

	public void setEmailCompany(String emailCompany) {
		this.emailCompany = emailCompany;
	}

	public FileImageInputStream getPhoto() {
		return photo;
	}

	public void setPhoto(FileImageInputStream photo) {
		this.photo = photo;
	}
	
	
	
	

}
