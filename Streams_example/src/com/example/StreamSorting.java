package com.example;

import java.util.Comparator;
import java.util.List;

import com.example.model.Student;

public class StreamSorting {

	public static void main(String[] args) {
		
		List<Student> studList = StudentUtil.getStudentsList();
		
		System.out.println("Sort by Names");
		Comparator<Student> studentNameComparator = Comparator.comparing(Student::getStudentName);
		studList.stream()
		.sorted(studentNameComparator)
		.forEach(System.out::println);
		
		System.out.println("Sort by MARK");
		Comparator<Student> MarksComparator = Comparator.comparing(Student::getMarkScored);
		studList.stream()
		.sorted(MarksComparator)
		.forEach(System.out::println);
		
		System.out.println("Sort by MARK Descending");
	
		studList.stream()
		.sorted(MarksComparator.reversed())
		.forEach(System.out::println);

	}

}
