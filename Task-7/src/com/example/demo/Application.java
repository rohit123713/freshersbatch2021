package com.example.demo;

import org.example.Advocate;
import org.example.CivilEngineer;
import org.example.Plumber;
import org.example.SoftwareEngineer;

import com.example.Billable;

public class Application {

	public static void printAmount(Billable billable) {
		Billable softwareengineer= new SoftwareEngineer("rahul", "123", 2000, "whoknows");

		Billable Civilengineer= new CivilEngineer("rahul", "123", 4000, "hi");

		Billable plumber= new Plumber("rahul", "123", 6000, "known");

		Billable advocate= new Advocate("ravi","567",8000,"hello");
		
		Billable[] billable1= {softwareengineer,Civilengineer,plumber,advocate};
		System.out.println(billable.calculate(billable1));
	}
	public static void main(String[] args) {
		
         printAmount(new SoftwareEngineer("rahul", "123", 2000, "whoknows"));
	}

}
