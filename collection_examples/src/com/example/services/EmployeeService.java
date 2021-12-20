package com.example.services;

import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.model.Employee;
import com.example.model.Student;

public class EmployeeService implements CrudRepository<Employee> {

	@Override
	public boolean add(Employee object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateMark(Employee object, double revisedMark) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Employee object) {
		// TODO Auto-generated method stub
		return false;
	}

}
