package com.example.demo;

import java.io.IOException;
import java.util.logging.*;

import com.example.demo.utilis.Logging_Utility;
public class Application {

	
	SimpleFormatter form;
	//static Logger logger= Logger.getLogger(Application.class.getClass().getName());
	
	 

	public static void main(String[] args) {
	     
		Logger logger = Logging_Utility.getLogger(Application.class) ;
		//logger.setLevel(Level.WARNING);
		
		FileHandler handler;
		try {
			handler = new FileHandler("mylogs.log");
			logger.addHandler(handler);
		} catch (SecurityException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		logger.severe("1- Critical Message");
		logger.warning("2- warning message");
        logger.info("3- java.uti.logger configured successfully");
     
        logger.fine("4- finer message");
	}

}
