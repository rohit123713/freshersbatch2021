package com.training;

public class BookApplication {

	public static void main(String[] args) {
	  
		Book headFirst= new Book();
//		
//		headFirst.setAuthorId("Kathy Sierra");
//		headFirst.setBookId(101);
//		headFirst.setPrice(450.00);
		
		System.out.println(headFirst.getBookId());
		System.out.println(headFirst.getAuthorId());
		System.out.println(headFirst.getPrice());
		
		Book effJava= new Book("Effective Java",102,560.00);
		
		System.out.println(effJava.getBookId());
		System.out.println(effJava.getAuthorId());
		System.out.println(effJava.getPrice());
	}

}
