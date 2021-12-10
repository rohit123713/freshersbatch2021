package com.example.demo.model;

import static java.lang.Math.*;
public class Invoice {
	
	//Declaring a constant
	public static final int STARTNUMBER= 100;
	
	private int invoiceNumber;  //instance variable
	
	private static double discount; //static or class variable
	
	/* instance Method can access both instance and static variables */
	public void show() {  
		//static variable and non-static variable are allowed in non-static method
		System.out.println(invoiceNumber);
		System.out.println(discount);
		
		showAll();
	}

	/*
	 * Static Method can access only static variables
	 */
	public static void showAll() {
		
		//System.out.println(invoiceNumber); //non-static variable is not allowed in static method
		System.out.println(discount);
		
		//show();
		System.out.println(Math.sqrt(4));
		
		double radian30= Math.toRadians(30);
		
		System.out.println(sin(radian30));
		
        double radian60= Math.toRadians(60);
		
		System.out.println(cos(radian60));
		
	}
	
	public static void showAll2() {

		//System.out.println(invoiceNumber); //non-static variable is not allowed in static method
		System.out.println(discount);
		
		//show();
		System.out.println(sqrt(4));
		
		//Here Math is not used since static import is used
		double radian30= toRadians(30);
		
		System.out.println(sin(radian30));
		
        double radian60= toRadians(60);
		
		System.out.println(cos(radian60));
	}
}
