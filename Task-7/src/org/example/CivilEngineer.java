package org.example;

import com.example.Billable;

public class CivilEngineer implements Billable {

	private String name;
	private String id;
	private int salary;
	private String designation;
	public CivilEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CivilEngineer(String name, String id, int salary, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "CivilEngineer [name=" + name + ", id=" + id + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}
	
	public double calculate(Billable[] objects) {
		return this.salary;
	}
}
