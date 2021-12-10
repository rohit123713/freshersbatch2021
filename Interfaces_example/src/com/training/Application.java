package com.training;

import com.training.ifaces.*;
import com.training.model.Professor;
import com.training.model.Student;

public class Application {
	
	public static void printResult(Conditional condition) {
		
		System.out.println(condition.test());
	}
	public static void printValues(Function[] objects) {
		
		for(Function eachFunction: objects) {
			System.out.println(eachFunction.apply(50));
		}
	}

	public static void main(String[] args) {
	
		Function usdtoInr = new CurrencyConverter();
		
		Function celtofar = new TempConverter();
		
		Function[] functions = {usdtoInr,celtofar};
		
		printValues(functions);
		
		Student ram=new Student(100, 80);
		printResult(ram);
		
		Professor kanna= new Professor(202,"mca");
		printResult(kanna);
	}

}
