package com.example;

import java.util.*;


public class Application_1 {

	public static void main(String[] args) {


		HashSet<String> Fruits1 = new HashSet<>();
		
		Fruits1.add("apple");
		Fruits1.add("orange");
		Fruits1.add("apple");
		Fruits1.add("pineapple");
		Fruits1.add("orange");
		Fruits1.add("banana");
		
		System.out.println("After removing the duplicates,the elements are");
		for(String fruits: Fruits1) {
			System.out.println(fruits);
			
		}
		TreeSet<String> Fruits2 = new TreeSet<>(Fruits1);
		
		System.out.println("The sorted elements are");
		for(String fruits: Fruits2) {
			
			System.out.println(fruits);
			
		}
//		Arrays.sort(Fruits);
//		
//		System.out.println(Arrays.toString(Fruits));
	}

}
