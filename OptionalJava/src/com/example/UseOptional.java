package com.example;

import java.util.Optional;

public class UseOptional {

	public static Optional<String> getMessage(int i){
		
		String result = null;
		if(i<5) {
			return Optional.of(result);
		}
		else {
			return Optional.empty();
		}
	}
	public static void main(String[] args) {
	
//		String str = null;
//		System.out.println(str.length());
		
		String name = "hello";
		Optional<String> optionalName = Optional.ofNullable(name);

		String result = optionalName.orElse("Check if the variable 'name' is not null");
		System.out.println(result);
		
		String city = "Chennai";
		Optional<String> optionalCity = Optional.ofNullable(city);
		
		if(optionalCity.isPresent()) {
			System.out.println("the length of city" + city.length());
		}else {
			System.out.println("Check if the value is assigned for city");
		}
		
//		System.out.println(getMessage(2).orElseThrow(()-> {return new RuntimeException("Invalid value - should be less than 5");}));
		
		Optional<String> resp = getMessage(22);
		
		if(resp.isPresent()) {
			System.out.println(resp.get());
		}else {
			System.out.println("Value of I should be greater than 5");
		}
	}

}
