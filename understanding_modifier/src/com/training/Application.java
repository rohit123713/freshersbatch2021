package com.training;

public class Application {

	public static void main(String[] args) {
		Student ram=new Student();
		
		// can't access firstName because it marked private
		//System.out.println(ram.firstName);
		
		// can access fees because its marked default (it's package scope)
		System.out.println(ram.fees);
	}

}
