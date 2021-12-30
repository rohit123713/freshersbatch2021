package com.example;

import com.example.functional.Converter;

public class Application {

	
	public static void printResult(Converter<Double,Double> conv, double args) {
		
		double result = conv.convert(args);
		
		System.out.println("Result:" +result);
	}
	public static void main(String[] args) {
	
		//Compare these two lines with convert method in Dummy.java
		Converter<Double,Double> conv = (val) -> {return 45 *val;};
		//Converter<Double,Double> conv = (val) -> return 45 *val;
		
		double result = conv.convert(100.0);
		
		System.out.println(result);
		printResult(conv,100.00);
		
		Converter<String,String> concat = (name) -> "HI" + name;
		//Converter<String,String> concat = (name) ->{return "HI" + name;};

		String response = concat.convert("Ramesh");
		
		System.out.println(response);
	}

}
