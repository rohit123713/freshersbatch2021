package com.example.demo.utilis;

import java.util.logging.Logger;

import com.example.demo.Application;

public class Logging_Utility {

	public static Logger getLogger(Class clsName) {
		

		      String path = clsName.getClassLoader()
		                  .getResource("logging.properties")
		                  .getFile();

		     String key= "java.util.logging.config.file";
		     
		     System.setProperty(key, path);
		     Logger logger = Logger.getLogger(clsName.getName());
		      
		      return logger;
	
		  
	}
}
