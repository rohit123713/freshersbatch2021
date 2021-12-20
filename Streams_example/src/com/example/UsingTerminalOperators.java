package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.model.Student;

public class UsingTerminalOperators {

	public static void main(String[] args) {
		
		List<Student> studList = StudentUtil.getStudentsList();
		
		Comparator<Student> markComparator = 
				Comparator.comparing(Student::getMarkScored);
		
		Optional<Student> maxMark =studList.stream().max(markComparator);
        if(maxMark.isPresent()) {
        	System.out.println("Highest Mark =" + maxMark.get().getMarkScored());
        }
        
        Optional<Double> maxMark1 =studList.stream().map(student -> student.getMarkScored()).max(Double::compareTo);
        if(maxMark.isPresent()) {
        	System.out.println("Highest Mark =" + maxMark1.get());
        }
        
        Optional<Double> minMark =studList.stream().map(student -> student.getMarkScored()).min(Double::compareTo);
        if(maxMark.isPresent()) {
        	System.out.println("Highest Mark =" + minMark.get());
        }
		
        System.out.println("Total Number of Students who have scored more than 90 Marks");
        
        long totalGrt90 = studList.stream()
        		.map(student -> student.getMarkScored()).filter(studentmarks -> studentmarks>90).count();
       
        System.out.println("Total:=" + totalGrt90);
        
        Map<String,Double> markList = studList.stream().collect(Collectors.toMap(Student::getStudentName, Student::getMarkScored));
        		
        Set<Map.Entry<String,Double>> set = markList.entrySet();
        
        for(Map.Entry<String,Double> eachEntry:set) {
        	System.out.println(eachEntry.getKey() + ":"+ eachEntry.getValue());
        }
        
        Map<Integer,Double> markList1 = studList.stream().collect(Collectors.toMap(Student::getRollNumber, Student::getMarkScored));
		
        Set<Map.Entry<Integer,Double>> set1 = markList1.entrySet();
        
        for(Map.Entry<Integer,Double> eachEntry:set1) {
        	System.out.println(eachEntry.getKey() + ":"+ eachEntry.getValue());
        }
	}

}
