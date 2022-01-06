package com.example.demo.services;

public class NameCheckException extends Exception{


	private String message;

	public NameCheckException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
}
