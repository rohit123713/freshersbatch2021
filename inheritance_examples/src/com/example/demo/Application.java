package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.services.EmployeeService;
public class Application {

	public static void main(String[] args) {
		
		Employee ram= new Employee(101, "Ramesh", "manager", 60000);
		
		String[] skills = {"java", "dotnet","testing","mainframe"};
		Manager mgr = new Manager(102,"Suresh","Manager",75000,skills);
		
		System.out.println(ram.toString());
        
		for(String eachskill:mgr.getSkillset()) {
		System.out.println(eachskill);
		}
		
		EmployeeService service= new EmployeeService();
		
		Employee[] emp= new Employee[4];
		Employee e1= new Employee(12,"rakesh","developer",10000);
		Employee e2= new Employee(12,"magesh","tester",10023);
		Employee e3= new Employee(12,"ravi","analyser",10234);
		
		Manager mgr1= new Manager(102,"Suresh","Manager",75000,skills);
		
		Manager mgr2 = new Manager(103,"Magesh","Manager",85000,skills);
		
		
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		
		//Employee[] emplist= {e1,e2,e3};
		
		//super(Employee.class)=sub(Manager.class)
		//but sub is not equal to super
		Employee[] emplist2= {mgr1,mgr2};
		service.printEmployees(emp);
	}

}
