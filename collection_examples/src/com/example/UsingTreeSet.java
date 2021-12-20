package com.example;

import java.util.*;

import com.example.model.Student;
public class UsingTreeSet {

	public static void print(Collection<Student> objects) {
		
		for(Student eachStudent:objects) {
			System.out.println(eachStudent);
		}
	}
	public static void main(String[] args) {

		Student anand= new Student(101,"Anand",78);
		Student dravid= new Student(102,"dravid",98);
		Student zahir= new Student(103,"zahir",88);
		
		TreeSet<Student> treeSet = new TreeSet<Student>();

		treeSet.add(anand);
		treeSet.add(dravid);
		treeSet.add(zahir);
		
		print(treeSet);
	}

}
