package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;

@Configuration
public class AppConfig {

	//Factory Method with a Bean id same as method name- here it 
	// is ram
	
	@Bean
	public Doctor ram(@Qualifier("tom") Patient tom) {
		return new Doctor(101,"Ram","chennai",tom);
	}
	
	//Factory Method with a Bean id same as method name- here it 
		// is shyam
	@Bean
	public Doctor shyam(@Qualifier("dick") Patient tommy) {
		return new Doctor(102,"Shyam","Ponneri",tommy);
	}
	
	@Bean
	public Patient tom() {
		return new Patient(989,"Tom",56);
	}
	@Bean
	public Patient dick() {
		return new Patient(990,"Dick",66);
	}
	
	@Bean
	public Patient harry() {
		return new Patient(991,"Harry",69);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
