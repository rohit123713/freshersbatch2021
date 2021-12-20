package com.training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.training.model.Invoice;

public class Application {

	public static void main(String[] args) {
		
		Invoice rams = 
		new Invoice(101, "Ram", 55,800,LocalDate.of(2020, Month.OCTOBER, 12));

		Invoice siva = 
				new Invoice(102, "Shiv", 55,900,LocalDate.of(2020,6,8));
		
		Invoice vicky =
				new Invoice(103,"Vickt",50,200,LocalDate.now());
		
		System.out.println(rams);
		System.out.println(siva);
		System.out.println(vicky);
		
		LocalDate vickyDate = vicky.getInvoiceDate();
		
		System.out.println(vickyDate.plusYears(2));
		System.out.println(vickyDate.minusMonths(5));
		
		LocalDate birthDate = LocalDate.of(1998, Month.JULY, 12);
		LocalDate today = LocalDate.now();
		
		long years = today.getYear()-birthDate.getYear();
		long months = today.getMonthValue() - birthDate.getMonthValue();
		
		System.out.println("Age :=" +years + "years, Month:=" + months);
		
		String date = "2022-01-03";
		
		LocalDate firstDayof2022 = LocalDate.parse(date);
		
		System.out.println(firstDayof2022.getDayOfWeek());
		
		String birthDateAsString = birthDate.toString();
		
		System.out.println(birthDateAsString);
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		
		
		
		
	}

}
