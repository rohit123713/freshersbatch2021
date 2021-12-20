package com.example.demo.model;

public class InvalidEmailException extends Exception{

	private String message;

	public InvalidEmailException(String message) {
		
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
}
