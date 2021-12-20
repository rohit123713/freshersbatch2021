package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.RangeCheckException;

public class EmployeeService {

	Employee emp =new Employee();
	
	public double calculateTotalSalary(Employee[] empList) {
        double total=0;
		if(empList.length <2 || empList.length >5) {
			try {
				throw new RangeCheckException("length <2 = >5");
			} catch (RangeCheckException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		} else {
				for(Employee emp:empList) {
				double salary= emp.getSalary();
				total = total +salary;
							
			}
		}
		return total;
	}
}
