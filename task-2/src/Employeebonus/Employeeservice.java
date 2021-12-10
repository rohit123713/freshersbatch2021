package Employeebonus;

import org.training.Employee;

public class Employeeservice {
   
	public double calculateBonus(Employee employ) {
		
		return employ.getEmployeeSalary()*.33;
	}
}
