package com.example.demo;

import com.example.demo.service.MessageService;
import com.example.model.Doctor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	MessageService service = new MessageService();
    	
    	System.out.println(service.getMessage());
    	
    	Doctor doctor = new Doctor(234, "venkat","doctoreye", "madurai");
    	
    	System.out.println(doctor.toString());
    	
    }
}
