package com.example;

import java.util.*;
import java.util.function.*;

import com.example.functional.Converter;

public class UsingBuiltInFunctionalInterfaces {

	//the line 34 is same as this
//	class Abc implements Predicate<String>{
//
//		@Override
//		public boolean test(String t) {
//			// TODO Auto-generated method stub
//			return t.contains("m");
//		}
//		
//	}
	public static void main(String[] args) {
        
		List<String> nameList = Arrays.asList("murugan","ashwin","ramesh"
				,"suresh");
//		
//		//Method-1 of printing the values in list
//		for(String eachName: nameList) {
//			System.out.println(eachName);
//		}
//
//		//Method-2 of printing the values in list using lamda
//		nameList.forEach((val)-> {System.out.println(val);});
		
		//Method-3 of printing the values in list
		nameList.forEach(System.out::println);
		
		System.out.println("======Predicate======");
		Predicate<String> checkName = (name) -> name.contains("m");
		
		nameList.forEach((name) -> {
			if(checkName.test(name)) {
				System.out.println(name);
			}
		});
		
		System.out.println("======Predicate negatate======");
		Predicate<String> checkNamenegate = (name) -> name.contains("m");
		
		nameList.forEach((name) -> {
			if(checkNamenegate.negate().test(name)) {
				System.out.println(name);
			}
		});
		
		Function<String,String> concat = (name) -> "HI" + name;
		//Converter<String,String> concat = (name) ->{return "HI" + name;};

		String response = concat.apply("Ramesh");
		
		System.out.println(response);
		
	    Function<Double,Double> conv = (val) -> {return 45 *val;};
		
		Double value = conv.apply(100.0);
		
		System.out.println(value);
		
		Converter<Double,Double> convWithdefaultMethod = (val) -> {return val * 50.00;};
		
		System.out.println(convWithdefaultMethod.update(100.00));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
