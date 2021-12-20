package com.example;

import com.example.model.Student;
import java.util.*;

public class UsingHashSet {

	
    public static void print(Collection<Student> objects) {
		
		for(Student eachStudent:objects) {
			System.out.println(eachStudent);
		}
	}
    
	public static void main(String[] args) {
	

		Student anand= new Student(101,"Anand",78);
		Student dravid= new Student(102,"dravid",98);
		Student zahir= new Student(103,"zahir",88);
        Student zahirSenior = new Student(103,"zahir",88);
        
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(anand);
		hashSet.add(dravid);
		hashSet.add(zahir);
		boolean isAdded = hashSet.add(zahirSenior);
		
		System.out.println(isAdded);
		print(hashSet);
	}

}
