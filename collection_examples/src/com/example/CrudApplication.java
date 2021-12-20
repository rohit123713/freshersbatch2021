package com.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import com.example.ifaces.CrudRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.services.StudentService;
import com.example.utilis.MarksComparator;
import com.example.utilis.StudentNameComparator;

public class CrudApplication {

	int a=10;
	
	public static void print(List<Student> list) {
		
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
	}
	}
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(CrudApplication.class.getClass().getName());
		Student anand= new Student(101,"Anand",78);
		Student dravid= new Student(102,"dravid",98);
		Student zahir= new Student(103,"zahir",88);
		Student chandru= new Student(104,"Chandru",68);
		Student ramesh = new Student(105,"ramesh",97);
		
//		StudentService service= new StudentService();
//		service.add(anand);
//		service.add(dravid);
//		service.add(zahir);
//		service.add(chandru);
//		service.add(ramesh);
		
		StudentRepository repo= new StudentService();
		
		repo.add(anand);
		repo.add(dravid);
		repo.add(zahir);
		repo.add(chandru);
		repo.add(ramesh);
		List<Student> list = repo.findAll();
		
		//Collections.sort(list);
		
		//Collections.sort(list,new StudentNameComparator());
		
		Collections.sort(list,new MarksComparator());
		Iterator<Student> itr = list.iterator();
		//print(list);
		
		boolean result = repo.remove(dravid);
		
		if(result) {
			logger.info("One student deleted" + dravid);
			System.out.println("After Delete");
			
		}
		else {
			throw new RuntimeException("Student does not exist");
		}
		print(repo.findAll());
		Object updated = (Student)repo.updateMark(ramesh, 90);
		
		System.out.println(updated);
		System.out.println("*****");
		
		print(repo.findAll());
		
		List<Student> top3List = repo.getTopThreebyMark();
		
		System.out.println(top3List);
		
	}

}
