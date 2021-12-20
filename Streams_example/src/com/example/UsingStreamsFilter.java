package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import com.example.model.Student;
public class UsingStreamsFilter {

	public static void printStudentsByCondition(Collection<Student> studList, Predicate<Student> condition) {
		studList.stream()
		   .filter(condition)
            .forEach(System.out::println);
	}
	
	public static List<Student> getStudentScoredl90(Collection<Student> studList, Predicate<Student> condition) {
		return studList.stream()
		   .filter(condition)
         .collect(toList());
	}
	public static void main(String[] args) {
		
		Student anand= new Student(101,"Anand",78);
		Student dravid= new Student(102,"dravid",98);
		Student zahir= new Student(103,"zahir",88);
		Student chandru= new Student(104,"Chandru",68);
		Student ramesh= new Student(105,"Ramesh",96);
		
		ArrayList<Student> studList = new ArrayList<Student>();
		
		studList.add(anand);
		studList.add(dravid);
		studList.add(zahir);
		studList.add(chandru);
		studList.add(ramesh);
		
        Predicate<Student> grtThan90 = student -> student.getMarkScored()>90;
		
		System.out.println("Student scored more than 90");
		printStudentsByCondition(studList,grtThan90);
		
		studList.stream()
		   .filter(student -> student.getMarkScored()>90)
               .forEach(System.out::println);
//		

		 Predicate<Student> lessThan90 = student -> student.getMarkScored()<90;
			
			System.out.println("Student scored less than 90");
		List<Student> listMarks1= getStudentScoredl90(studList,lessThan90);
		System.out.println(listMarks1);
		
		List<Student> listMarks= studList.stream()
		   .filter(student -> student.getMarkScored()>90)
            .collect(toList());
		
		System.out.println(listMarks);
		
	
	}

}
