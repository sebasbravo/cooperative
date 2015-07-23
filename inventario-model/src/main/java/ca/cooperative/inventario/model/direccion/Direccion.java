package ca.cooperative.inventario.model.direccion;

public class Direccion {
	
	private int codigoDireccion;
	private String apartamento;
	private String numero;
	private String nombreCalle;
	private String codigoPostal;
	private Ciudad ciudad;
	
	public Direccion() {
	}

	public int getCodigoDireccion() {
		return codigoDireccion;
	}

	public void setCodigoDireccion(int codigoDireccion) {
		this.codigoDireccion = codigoDireccion;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	

}
