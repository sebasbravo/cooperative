package ca.cooperative.inventario.model;

public class MovementDetail {
	
	private int movementDetailId;
	private Movement movement;
	private Warehouse warehouse;
	
	public MovementDetail() {
		super();
	}

	public int getMovementDetailId() {
		return movementDetailId;
	}

	public void setMovementDetailId(int movementDetailId) {
		this.movementDetailId = movementDetailId;
	}

	public Movement getMovement() {
		return movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	

}
