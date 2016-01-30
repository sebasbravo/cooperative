package ca.cooperative.inventario.model.persona;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends PersonaNatural {
	
	private String codigoEmpleado;
	private DepartamentoEmpresa departamentoEmpresa;
	private List<Empleado> subordinados;
	
	public Empleado() {
		super();
	}

	public Empleado(String codigoEmpleado, DepartamentoEmpresa departamentoEmpresa) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.departamentoEmpresa = departamentoEmpresa;
		subordinados = new ArrayList<Empleado>();
	}

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public DepartamentoEmpresa getDepartamentoEmpresa() {
		return departamentoEmpresa;
	}

	public void setDepartamentoEmpresa(DepartamentoEmpresa departamentoEmpresa) {
		this.departamentoEmpresa = departamentoEmpresa;
	}

	public List<Empleado> getSubordinados() {
		return subordinados;
	}

	public void setSubordinados(List<Empleado> subordinados) {
		this.subordinados = subordinados;
	}
	
	public void adicionarEmpleado(Empleado empleado){
		subordinados.add(empleado);
	}
	
	public void removerEmpleado(Empleado empleado){
		subordinados.remove(empleado);
	}

}
