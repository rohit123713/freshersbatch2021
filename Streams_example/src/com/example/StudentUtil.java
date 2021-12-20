package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Student;

public class StudentUtil {

	public static List<Student> getStudentsList(){
			Student anand= new Student(101,"Anand",78);
			Student dravid= new Student(102,"dravid",98);
			Student zahir= new Student(103,"zahir",88);
			Student chandru= new Student(104,"Chandru",68);
			Student ramesh= new Student(105,"Ramesh",96);
			//Student rameshKumar = new Student(105,"Ramesh",96);
			
			ArrayList<Student> studList = new ArrayList<Student>();
			
			studList.add(anand);
			studList.add(dravid);
			studList.add(zahir);
			studList.add(chandru);
			studList.add(ramesh);
			//studList.add(rameshKumar);
			
			return studList;
			
	}

}
