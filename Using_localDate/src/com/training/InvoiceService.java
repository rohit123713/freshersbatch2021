package com.training;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.training.model.Invoice;

public class InvoiceService {

	public static List<Invoice> getInvoice(){
		
		//return a arraylist of invoices with minimum 7 to 8 elements
		//having different values
		List<Invoice> list = new ArrayList<Invoice>();
		
		Invoice rahul = 
				new Invoice(101, "Rahul", 55,800,LocalDate.of(2020, Month.OCTOBER, 12));
		Invoice sai = 
				new Invoice(102, "Sai", 55,700,LocalDate.of(2020,6,8));
		Invoice vinay = 
				new Invoice(103, "Vinay", 55,600,LocalDate.of(2020,5,6));
		Invoice raj = 
				new Invoice(104, "Raj", 55,1100,LocalDate.of(2020,4,4));
		
		Invoice suhail = 
				new Invoice(105, "Suhail", 55,1000,LocalDate.of(2020,6,7));
		Invoice mohammed = 
				new Invoice(106, "Mohammed", 55,100,LocalDate.of(2020,10,7));
		Invoice sheriff = 
				new Invoice(107, "SHeriff", 55,900,LocalDate.of(2020,1,5));
		
		list.add(rahul);
		list.add(sai);
		list.add(vinay);
		list.add(raj);
		list.add(suhail);
		list.add(mohammed);
		list.add(sheriff);
		
		return list;
	}
}
