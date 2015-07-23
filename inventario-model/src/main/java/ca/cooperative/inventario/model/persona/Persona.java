package ca.cooperative.inventario.model.persona;

public class Persona {
	
	private TipoDocumento tipoDocumento;
	private String numeroDocuemnto;
	private TipoPersona tipoPersona;
	private String nombre;
	private String telefono;
	private String email;
	
	public Persona() {
		super();
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocuemnto() {
		return numeroDocuemnto;
	}

	public void setNumeroDocuemnto(String numeroDocuemnto) {
		this.numeroDocuemnto = numeroDocuemnto;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
