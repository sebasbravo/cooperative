package ca.cooperative.inventario.model;

import java.time.LocalDate;
import java.util.Map;

import ca.cooperative.general.model.Employee;

public class Order {
	
	private String orderCode;
	private Employee employeeApprover;
	private Employee employeePetitioner;
	private Employee employeeReceiver;
	private LocalDate requiredDate;
	private LocalDate approvedDate;
	private LocalDate shippedDate;
	private Map<String, OrderDetail> orderDetail;
	private boolean state;
	
	public Order() {
		super();
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Employee getEmployeeApprover() {
		return employeeApprover;
	}

	public void setEmployeeApprover(Employee employeeApprover) {
		this.employeeApprover = employeeApprover;
	}

	public Employee getEmployeePetitioner() {
		return employeePetitioner;
	}

	public void setEmployeePetitioner(Employee employeePetitioner) {
		this.employeePetitioner = employeePetitioner;
	}

	public Employee getEmployeeReceiver() {
		return employeeReceiver;
	}

	public void setEmployeeReceiver(Employee employeeReceiver) {
		this.employeeReceiver = employeeReceiver;
	}

	public LocalDate getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(LocalDate requiredDate) {
		this.requiredDate = requiredDate;
	}

	public LocalDate getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}

	public LocalDate getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(LocalDate shippedDate) {
		this.shippedDate = shippedDate;
	}
	
	public Map<String, OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Map<String, OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	

}
