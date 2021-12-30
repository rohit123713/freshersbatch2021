package com.example.demo.entity.oneto.many;

import java.util.*;

import com.example.demo.Patient;
public class Doctor {

	private int doctorId;
	private String doctorName;
	private long handPhone;
	private String email;
	private String specialization;
	private String city;
	
	private List<Patient> patientList;

	private Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorId, String doctorName, long handPhone, String email, String specialization, String city,
			List<Patient> patientList) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.email = email;
		this.specialization = specialization;
		this.city = city;
		this.patientList = patientList;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", handPhone=" + handPhone + ", email="
				+ email + ", specialization=" + specialization + ", city=" + city + ", patientList=" + patientList
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
