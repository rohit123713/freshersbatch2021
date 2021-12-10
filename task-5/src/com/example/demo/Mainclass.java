package com.example.demo;

import java.util.Scanner;

import com.example.demo.model.Book;
import com.example.demo.model.BookService;

public class Mainclass {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		System.out.println("enter the author");
		String author=sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter the price");
		int price=sc.nextInt();
		
		System.out.println("enter the bookName");
		String bookName=sc.nextLine();
		sc.nextLine();
		Book book= new Book(id,bookName,author,price);
		
		BookService service=new BookService();
		
		System.out.println("Type the Customer");
		String customer=sc.nextLine();
		sc.nextLine();
		
		System.out.println(service.discountMethod(book));
		System.out.println(service.discountMethod2(book,customer));
        sc.close();
	}

}
