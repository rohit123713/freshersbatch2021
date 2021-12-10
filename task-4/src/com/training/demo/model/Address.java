package com.training.demo.model;

public class Address {

	private int streetNo;
	private int houseNo;
	private String city;
	private String state;
	private int pinCode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(int streetNo, int houseNo, String city, String state, int pinCode) {
		super();
		this.streetNo = streetNo;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}


	public int getStreetNo() {
		return streetNo;
	}


	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}


	public int getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
    
	
	
}