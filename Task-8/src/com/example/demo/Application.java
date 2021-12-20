package com.example.demo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.demo.model.Customer;
import com.example.demo.model.InvalidEmailException;
import com.example.demo.utilis.Logging_Utility;

public class Application {

	public static void main(String[] args) {
	
		
		Logger logger= Logging_Utility.getLogger(Application.class);
		
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
		try {
			Customer customer = new Customer();
            customer.setEmail("abc@gmail");
            
            
			logger.severe(customer.toString());
		  
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
	}

}
