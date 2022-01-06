package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.services.NameCheckException;

public interface Crudrepository<T> {

	public int add(T t);
	public T findByName(String empName) throws NameCheckException;
	public List<T> findAll();
	public int update(T t);
}
