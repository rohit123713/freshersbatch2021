package com.example.demo;

import com.example.demo.service.Myservice;

public class Application {

	public static void main(String[] args) {
		
		Myservice service= new Myservice();
		
		service.mark();
		service.markwithnestedTryCatch("40");
		service.markwithMultiCatch("sixty");
		
		String city = null;
		
		try {
			service.exampleforDeclare(city);
		} catch (NullPointerException e) {
		
			e.printStackTrace();
		}
	}

}
