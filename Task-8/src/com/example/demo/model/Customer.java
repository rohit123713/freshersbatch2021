package com.example.demo.model;

public class Customer {

	private String customerId;
	private String customerName;
	private int phoneNumber; 
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String customerName, int phoneNumber, String email)
	     throws InvalidEmailException{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		//change the condition into should contain @ and one of the .org,.com,.in
		if(email.contains("@") && email.contains(".com") 
				|| email.contains(".org") 
				||  email.contains(".in")) {
			this.email=email;
		}
		else {
			throw new InvalidEmailException("Enter the valid email  (insert @,.com,.org,.in etc.., at the end)");
		}
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws InvalidEmailException {
		if(email.contains("@") && email.contains(".com") 
				|| email.contains(".org") 
				||  email.contains(".in")) {
			this.email=email;
		}
		else {
				throw new InvalidEmailException("Enter the valid email (insert @,.com,.org,.in etc.., at the end)");		
		}
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
	
	
}
