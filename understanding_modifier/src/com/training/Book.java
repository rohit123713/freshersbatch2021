package com.training;

public class Book {

	//private arguments
	private String authorId;
	private int bookId;
	private double price;
	
	//zero argument constructor
	public Book() {
		//super(); Either super or this but never both => because super/this should be
		// the first line
	    //this("darsh",102,450.00);
		super();
	}

	//paramaterized constructor
	public Book(String authorId, int bookId, double price) {
		super();
		//this.authorName refers to the field private string authorName
		//authorName refers to the method argument authorName
		this.authorId = authorId;
		this.bookId = bookId;
		this.price = price;
	}

	//getters and setters
	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	
	
}
