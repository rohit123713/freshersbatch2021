package com.example;

import java.util.List;

import com.example.model.Student;

public class UsingStreamDistinct {

	public static void main(String[] args) {
		
		List<Student> studList = StudentUtil.getStudentsList();
		
		//distinct - find the uniqueness of the two same objects
		// based on the equals and hashCode method
		studList.stream().distinct().forEach(System.out::println);

	}

}
