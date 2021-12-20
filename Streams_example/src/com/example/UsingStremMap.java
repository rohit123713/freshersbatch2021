package com.example;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;
import com.example.model.Student;

public class UsingStremMap {

	public static void main(String[] args) {
		
		List<Student> studList = StudentUtil.getStudentsList();
		
		Function<Student,String> mapCondition = (student) -> student.getStudentName();
		List<String> nameList = studList.stream()
				.map(student -> student.getStudentName()).collect(toList());
		
		System.out.println(nameList);
		
		System.out.println("Names of Students who have scored more than 90");
		
		List<String> nameListg90 = studList.stream()
				.filter(student -> student.getMarkScored()>90)
				.map(mapCondition).collect(toList());
		
		System.out.println(nameListg90);
		
        System.out.println("Names of Students who have scored less than 90");
		
		List<String> nameListl90 = studList.stream()
				.filter(student -> student.getMarkScored()<90)
				.map(mapCondition).collect(toList());
		
		System.out.println(nameListl90);
	}
	
}
