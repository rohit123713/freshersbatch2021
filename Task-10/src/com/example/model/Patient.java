package com.example.model;

public class Patient{

	private int id;
	private String patientName;
	private String address;
	private String email;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int id, String patientName, String address, String email) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.address = address;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", address=" + address + ", email=" + email + "]";
	}
	
	
}
