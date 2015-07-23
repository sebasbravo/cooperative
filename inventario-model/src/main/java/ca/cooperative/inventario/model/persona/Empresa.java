package ca.cooperative.inventario.model.persona;

import ca.cooperative.inventario.model.direccion.Direccion;

public class Empresa extends Persona {
	
	private String fax;
	private Direccion direccion;
	private String tps;
	private String tvq;
	private String NIR;
	private PersonaNatural contacto;
	
	public Empresa() {
		super();
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getTps() {
		return tps;
	}

	public void setTps(String tps) {
		this.tps = tps;
	}

	public String getTvq() {
		return tvq;
	}

	public void setTvq(String tvq) {
		this.tvq = tvq;
	}
	
	public String getNIR() {
		return NIR;
	}

	public void setNIR(String nIR) {
		NIR = nIR;
	}

	public PersonaNatural getContacto() {
		return contacto;
	}

	public void setContacto(PersonaNatural contacto) {
		this.contacto = contacto;
	}
	
	
	

}
