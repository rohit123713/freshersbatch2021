package com.example;
import java.util.*;

import com.example.model.Student;

public class UsingHashMap {

	
	public static void main(String[] args) {
         
		Student anand= new Student(101,"Anand",78);
		Student dravid= new Student(102,"dravid",98);
		Student zahir= new Student(103,"zahir",88);
		Student zahirSenior = new Student(103,"zahirSenior",88);
		HashMap<Integer,Student> map = new HashMap<Integer,Student>();
		
		//AutoBoxing feature of java allow primitive 989 to be converted
		//to Object Integer
		System.out.println(map.put(989, anand));
		System.out.println(map.put(990, dravid));
		System.out.println(map.put(991, zahir));
		System.out.println(map.put(991, zahirSenior));
		
		//it will return the new entry and not the old one
		//it replaces the old entry with new one
		System.out.println("From Map" + map.get(991));
		
		Set<Map.Entry<Integer, Student>> setView = map.entrySet();
		
		Iterator<Map.Entry<Integer, Student>> itr= setView.iterator();
//		
//		while(itr.hasNext()) {
//			
//			Map.Entry<Integer, Student> eachElement = itr.next();
//			System.out.println("Key:=" + eachElement.getKey());
//			System.out.println("Value:" + eachElement.getValue());
//		}
		
		Set<Map.Entry<Integer, Student>> studSet = map.entrySet();
		
		//use For each loop and print
		
		for(Map.Entry<Integer, Student> obj: studSet) {
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
		}
	
     }
}
