package com.example.demo;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.demo.model.Employee;
import com.example.demo.model.RangeCheckException;
import com.example.demo.service.EmployeeService;
import com.example.demo.utilis.Logging_Utility;

public class TestCustomException {

	public static void main(String[] args) {
		
	   Logger logger = Logging_Utility.getLogger(TestCustomException.class);
       Employee ram = new Employee();
       
       try {
		FileHandler handler= new FileHandler("logs.log", true);
		logger.addHandler(handler);

	} catch (SecurityException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       
         
       ram.setEmployeeId(12);
       ram.setSalary(2000);
       
       EmployeeService service = new EmployeeService();
      
		try {
			Employee shyam = new Employee(102, "shyam", "manager", 4000);
			logger.info(shyam.toString());
			logger.severe(ram.toString());
			Employee[] emp = {ram,shyam};

		       System.out.println(service.calculateTotalSalary(emp));
		} catch (RangeCheckException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}

	}

}
