package com.to;

public class Employee {
	private int employeeID;
	private String employeeName;
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + "]";
	}
	public int getEmployeeID() {
		System.out.println("Setting Employee ID called");
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		System.out.println("Setting Employee name called");
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
