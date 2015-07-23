package ca.cooperative.inventario.model.persona;

import ca.cooperative.inventario.model.direccion.Direccion;

public class PersonaNatural extends Persona {
	
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private Direccion direccion;
	
	
	public PersonaNatural() {
		super();
	}


	public String getNombre2() {
		return nombre2;
	}


	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	

}
