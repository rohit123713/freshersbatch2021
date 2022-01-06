package com.example.demo.Entity;

import java.sql.Date;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String address;
	private String email_Address;
	private long phone_Number;
	private Date birthday;
	private Date wedding_Anniversary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String firstName, long phone_Number) {
		super();
		this.firstName = firstName;
		this.phone_Number = phone_Number;
	}


	public Employee(int employeeId, String firstName, String lastName, String address, String email_Address) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email_Address = email_Address;
	}


	public Employee(int employeeId, String firstName, String lastName, String address, String email_Address,
			long phone_Number, Date birthday, Date wedding_Anniversary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email_Address = email_Address;
		this.phone_Number = phone_Number;
		this.birthday = birthday;
		this.wedding_Anniversary = wedding_Anniversary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail_Address() {
		return email_Address;
	}
	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}
	public Long getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(long phone_Number) {
		this.phone_Number = phone_Number;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getWedding_Anniversary() {
		return wedding_Anniversary;
	}
	public void setWedding_Anniversary(Date wedding_Anniversary) {
		this.wedding_Anniversary = wedding_Anniversary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", email_Address=" + email_Address + ", phone_Number=" + phone_Number
				+ ", birthday=" + birthday + ", wedding_Anniversary=" + wedding_Anniversary + "]";
	}


//	@Override
//	public String toString() {
//		return "Employee [firstName=" + firstName + ", phone_Number=" + phone_Number + "]";
//	}
	
	
	
	
	
}