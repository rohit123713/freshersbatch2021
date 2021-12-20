package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.model.Doctor;


public class Service implements CrudRepository<Doctor>{

	private ArrayList<Doctor> DoctorList;
	
	
	public Service() {
		super();
		DoctorList = new ArrayList<>();
	}


	@Override
	public boolean add(Doctor object) {
		
		return DoctorList.add(object);
	}


	@Override
	public List<Doctor> findAll() {
	
		return this.DoctorList;
	}


	@Override
	public Doctor updateDesignation(Doctor object, String designation) {
		int indexPos=DoctorList.indexOf(object);
		Doctor foundPosition= DoctorList.get(indexPos);
		foundPosition.setSpecialization(designation);
		return DoctorList.set(indexPos, foundPosition);
	}
	

	@Override
	public boolean remove(Doctor object) {
		// TODO Auto-generated method stub
		return DoctorList.remove(object);
	}



}
