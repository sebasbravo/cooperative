package ca.cooperative.inventario.model.persona;

import java.util.ArrayList;
import java.util.List;

public class Sucursal extends Empresa {
	
	private List<Sucursal> sucursalPersonaJuridica;

	public Sucursal() {
		super();
		sucursalPersonaJuridica = new ArrayList<Sucursal>();
	}

	public List<Sucursal> getSucursal() {
		return sucursalPersonaJuridica;
	}

	public void setSucursal(List<Sucursal> sucursalPersonaJuridica) {
		this.sucursalPersonaJuridica = sucursalPersonaJuridica;
	}
	
	public void adicionarSucursal(Sucursal sucursal){
		sucursalPersonaJuridica.add(sucursal);
	}
	
	public void suprimirSucursal(Sucursal sucursal){
		sucursalPersonaJuridica.remove(sucursal);
	}
	

}
