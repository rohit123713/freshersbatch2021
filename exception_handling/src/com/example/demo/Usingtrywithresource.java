package com.example.demo;

import java.util.Scanner;
public class Usingtrywithresource {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in);){

	         System.out.println("Enter your name");
	         String name = sc.next();
	        
		} catch (Exception e) {
			
		}
       
         
	}

}
