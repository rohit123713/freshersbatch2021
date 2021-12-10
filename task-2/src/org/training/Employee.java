package org.training;

public class Employee {

	private String EmployeeId;
	private String EmployeeName;
	private double EmployeeSalary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String employeeId, String employeeName, double employeeSalary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}


	public String getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}


	public String getEmployeeName() {
		return EmployeeName;
	}


	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}


	public double getEmployeeSalary() {
		return EmployeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
	
	
}
