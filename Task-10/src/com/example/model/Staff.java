package com.example.model;

public class Staff{

	private int id;
	private String staffName;
	private long phoneNumber;
	private int salary;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int id, String staffName, long phoneNumber, int salary) {
		super();
		this.id = id;
		this.staffName = staffName;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffName=" + staffName + ", phoneNumber=" + phoneNumber + ", salary=" + salary
				+ "]";
	}
	
	
}
