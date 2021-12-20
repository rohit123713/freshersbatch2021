package com.example.demo;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println(args[0].toLowerCase());
			String city= null;
			System.out.println(city.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.err.println("You have to add a command line Argument - Check the input");
			e.printStackTrace();
		}
		
       catch (NullPointerException e) {
			
			System.err.println("City name should be given - check its not null");
			e.printStackTrace();
		}
		
		try {
			System.out.println(args[0].toLowerCase());
			String city= null;
			System.out.println(city.length());
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			
			e.printStackTrace();
		}

	}

}
