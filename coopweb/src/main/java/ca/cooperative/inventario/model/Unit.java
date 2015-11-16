package ca.cooperative.inventario.model;

public class Unit {
	
	private int unitId;
	private String name;
	private String description;
	
	
	
	public Unit() {
		super();
	}



	public Unit(int unitId, String name, String description) {
		super();
		this.unitId = unitId;
		this.name = name;
		this.description = description;
	}



	public int getUnitId() {
		return unitId;
	}



	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
