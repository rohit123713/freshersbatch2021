package com.example.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.utilis.MarksComparator;

public class StudentService implements StudentRepository<Student> {

	private ArrayList<Student> studList;
	
//	ArrayList<String> list2;
//	
//	ArrayList<Exception> list3;
	
	public StudentService() {
		super();
		studList = new ArrayList();
	}

	@Override
	public boolean add(Student object) {
		
		return studList.add(object);
	}

	@Override
	public List<Student> findAll() {
		
		return this.studList;
	}

	@Override
	public Student updateMark(Student object, double revisedMark) {
	
		int indexPos=studList.indexOf(object);
		Student foundPosition= studList.get(indexPos);
		foundPosition.setMarkScored(revisedMark);
		//return foundPosition;
		
		return studList.set(indexPos, foundPosition);
	}

	@Override
	public boolean remove(Student object) {
	    
		return studList.remove(object);
	}

	@Override
	public List<Student> getTopThreebyMark() {
		Collections.sort(studList, new MarksComparator());
		ArrayList<Student> list = new ArrayList();
		for(int i=0;i<=2;i++) {
			list.add(studList.get(i));
		}
		return list;
		
	}

	@Override
	public double getAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
