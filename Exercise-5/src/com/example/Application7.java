package com.example;

public class Application7 {


	String value = "Hello";
	public static void changeValue(Application7 app7){
		app7.value = "Welcome";
        
		}
	
	public static void main(String[] args) {
	
		Application7 app7 = new Application7();
		
		System.out.println(app7.value);
		changeValue(app7);
		System.out.println(app7.value);
		
		
	}
}
	
	


