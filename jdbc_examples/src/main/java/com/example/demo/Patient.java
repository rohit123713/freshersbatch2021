package com.example.demo;

public class Patient {

	private int patientId;
	private String patientName;
	private String address;
	private int doctorRef;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, String address, int doctorRef) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.address = address;
		this.doctorRef = doctorRef;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
	public int getDoctorRef() {
		return doctorRef;
	}
	public void setDoctorRef(int doctorRef) {
		this.doctorRef = doctorRef;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", address=" + address
				+ ", doctorRef=" + doctorRef + "]";
	}
	
	
}
