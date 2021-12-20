package com.example;

import java.util.Scanner;

public class Application2 {

	public static void RotatingArraybyleft(int[] Numbers,int n) {
		for(int i = 0; i < n; i++){  
			int j, first;  
			first = Numbers[0];  
			
			for(j = 0; j < Numbers.length-1; j++){  
			Numbers[j] = Numbers[j+1];  
			}  
			
			Numbers[j] = first;  
			}  
			
			System.out.println();  
			System.out.println("Array after left rotation is "); 
			
			for (int i = 0; i < Numbers.length; i++) {  
				System.out.print(Numbers[i] + " ");  
				} 
	}
	public static void main(String[] args) {
		int [] Numbers = {1, 2, 3, 4, 5}; 
		
		System.out.println("How many times it has to be ordered");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		//int n = 2;  
		
		System.out.println("Original array is ");  
		
		for (int i = 0; i < Numbers.length; i++) {  
		System.out.print(Numbers[i] + " ");  
		}  
		
		RotatingArraybyleft(Numbers,n);
		
		RotatingArraybyleft(Numbers,n);
		
		RotatingArraybyleft(Numbers,n);
		sc.close();
		
	}
}
