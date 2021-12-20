package com.example.ifaces;

import java.util.List;

import com.example.model.Student;

public interface StudentRepository<T> extends CrudRepository<T> {

	List<T> getTopThreebyMark();
	
	public double getAverage();
}
