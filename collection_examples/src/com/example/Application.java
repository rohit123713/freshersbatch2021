package com.example;

import java.util.*;

import com.example.model.Student;
public class Application {

	public static void main(String[] args) {
		  
		ArrayList<Student> studList = new ArrayList<Student>();

		Student anand= new Student(101,"Anand",78);
		Student dravid= new Student(102,"dravid",98);
		Student zahir= new Student(103,"zahir",88);
		Student chandru= new Student(104,"Chandru",68);
		Student ramesh = new Student(105,"ramesh",97);
		
		
		//String rakesh = new String("rakesh");
		studList.add(anand);   //0
		studList.add(dravid);  //1
		studList.add(zahir);   //2
		studList.add(chandru); //3
		studList.add(ramesh);  //4
		
		//Cannot add other than student object to studList sice its a typesafe
		//collection => its collection of only Student
		//studList.add(rakesh);
		
		for(Student eachStudent:studList) {
		System.out.println(eachStudent);
		}
		
		// downcasting object[] to student[]
		// toArray() method return type is object[]
		// but we require a Student[] array , so we are doing
		// downCasting
		
		//converting list to Array
		Object[] list = studList.toArray();
		System.out.println("*********");
		for(Object obj:list) {
		   Student stud = (Student)obj;
		   System.out.println(stud.getStudentName());
		}
		
		System.out.println("*********");
		//converting array to list
		Student[] studentList = {
				new Student(201,"Deepa", 78),
				new Student(201,"Diksha", 88)
		};
		
		List<Student> listFromArray = Arrays.asList(studentList);
		System.out.println(listFromArray);
	}

}
