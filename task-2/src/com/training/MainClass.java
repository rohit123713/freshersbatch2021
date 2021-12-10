package com.training;

import org.training.Employee;

import Employeebonus.Employeeservice;
import ext.training.Hotel;

public class MainClass {

	public static void main(String[] args) {
		
//		Hotel hotel= new Hotel();
//        
//		hotel.setRating("four");
//		hotel.setRoomNo(44);
//		hotel.setCustomerperday(25);
//		
//		System.out.println(hotel.getRating());
//		System.out.println(hotel.getRoomNo());
//		System.out.println(hotel.getCustomerperday());
		
		Employee employee= new Employee();
		Employeeservice employeeservice= new Employeeservice();
		employee.setEmployeeName("Ram");
		employee.setEmployeeId("E23");
		employee.setEmployeeSalary(12900);
		
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeSalary());
		System.out.println(employeeservice.calculateBonus(employee));
//		
//		Customer customer= new Customer("E1234","Rahim",946352762);
//		
//		System.out.println(customer.getCustomerName());
//		System.out.println(customer.getCustomerId());
//		System.out.println(customer.getCustomerPhone());
	}

}
