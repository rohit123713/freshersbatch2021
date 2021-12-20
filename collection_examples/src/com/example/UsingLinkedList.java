package com.example;

import java.util.*;

import com.example.model.Student;

public class UsingLinkedList {

	public static void main(String[] args) {
		
		Student anand= new Student(101,"Anand",78);
		Student dravid= new Student(102,"dravid",98);
		Student zahir= new Student(103,"zahir",88);
		
		List<Student> studList = new LinkedList<Student>();
		
		studList.add(anand);
		studList.add(dravid);
		studList.add(zahir);
		
		//Iterator<Student> itr = studList.iterator();
		
		// Since studList is a Linked List we can iterator on
		// both directions next as well previous
		ListIterator<Student> itr = studList.listIterator();
		
		System.out.println("Forward iteration");
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next().getStudentName());
		}
		
		System.out.println("Reverse Iteration");
		while(itr.hasPrevious()) {
			
			System.out.println(itr.previous().getStudentName());
		}
		
		
	}

}
