package com.example.demo.model;

public class BookService {

	public double discountMethod(Book book) {
		double bookprice= book.getPrice();
		
		if(bookprice<500) {
			return 0.05*bookprice;
		}
		else if(bookprice>500 && bookprice <1000) {
			return 0.1*bookprice;
		}
		else if(bookprice>1000) {
			return 0.12*bookprice;
		}
		else {
			return 0;
		}
	}
	
	public double discountMethod2(Book book,String customerType) {
		double bookprice=book.getPrice();
		
		switch(customerType.toLowerCase()) {
		case "corporatecustomer":
			if(bookprice<500) {
				return 0.07*bookprice;
			}
			else if(bookprice>500 && bookprice <1000) {
				return 0.12*bookprice;
			}
			else if(bookprice>1000) {
				return 0.15*bookprice;
			}
			else {
				return 0;
			}
		case "retailcustomer":
		
			if(bookprice<500) {
				return 0.05*bookprice;
			}
			else if(bookprice>500 && bookprice <1000) {
				return 0.10*bookprice;
			}
			else if(bookprice>1000) {
				return 0.12*bookprice;
			}
			else {
				return 0;
			}
		default:
			return 0;
			
	}
	}
}
