package com.example.ifaces;

import java.util.List;


public interface CrudRepository<T> {

	public boolean add(T object);
	public List<T> findAll();
	public T updateMark(T object,double revisedMark);
	public boolean remove(T object);
}
