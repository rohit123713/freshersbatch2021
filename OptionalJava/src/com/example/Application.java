package com.example;


public class Application {
	
	public static void main(String[] args) {

        int NumberOf1s=0;
        int NumberOf2s=0;
        int NumberOf5s=0;
        int NumberOf6s=0;
        int NumberOf7s=0;
		int[] A= {1,5,2,1,2,6,7,1};

		for(int i=0;i<A.length;i++) {
			//System.out.println(A[i]);
			
			if(A[i]==1) {
				NumberOf1s = NumberOf1s+1;
				System.out.println("Number of position of "+ A[i]+ "is =>" + i);
			}
			else if(A[i]==2) {
				NumberOf2s = NumberOf2s+1;
				System.out.println("Number of position of "+ A[i]+ "is =>" + i);
			}
			else if(A[i]==5) {
				NumberOf5s = NumberOf5s+1;
				System.out.println("Number of position of "+ A[i]+ "is =>" + i);
			}
			else if(A[i]==6) {
				NumberOf6s = NumberOf6s+1;
				System.out.println("Number of position of "+ A[i]+ "is =>" + i);
			}
			else {
				NumberOf7s = NumberOf7s+1;
				System.out.println("Number of position of "+ A[i]+ "is =>" + i);
			}
			
		}
		System.out.println("Number of occurences of 1 is =>" + NumberOf1s );
		System.out.println("Number of occurences of 2 is =>" + NumberOf2s );
		System.out.println("Number of occurences of 5 is =>" + NumberOf5s );
		System.out.println("Number of occurences of 6 is =>" + NumberOf6s );
		System.out.println("Number of occurences of 7 is =>" + NumberOf7s );
		}
		    

		
	}
	


	
