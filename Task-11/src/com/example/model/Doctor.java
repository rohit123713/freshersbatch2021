package com.example.model;

public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private String location;
    
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id, String name, String specialization, String location) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return id + "," + name + "," + specialization + ","+ location;
				
	}
    
    
}
