package com.example.demo.services;

import com.example.demo.model.*;
public class EmployeeService {

	public void printEmployees(Employee[] empllist) {
		
		for(Employee emp:empllist) {
			System.out.println(emp.getEmployeeId());
			System.out.println(emp.getSalary());
		}

	}
	
}
