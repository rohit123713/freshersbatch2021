package com.example.demo.service;

public class Myservice {
	
	//Try/catch method
	public int mark() {
		//Object strMark = new String("ninety");
		
		//Object strMark = new Integer(45);
		//Deprecated means in future the support will be withdrawn or it will be removed
		
		Object strMark = Integer.valueOf(45);
		int mark=0;
	
		try {
			mark = (Integer)strMark;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println(mark);
		return 0;
		}

	//Nested try/catch
	public double markwithnestedTryCatch(String markScored) {
		
	Object strMark = Integer.valueOf(45);
	int mark=0;
	double testScore= 0.0;
	try {
		try {
			mark = (Integer)strMark;
		} catch (ClassCastException er) {
			// TODO Auto-generated catch block
			er.printStackTrace();
		}
		
		testScore = Double.parseDouble(markScored);
	} catch (NumberFormatException e) {
		
		e.printStackTrace();
	}
	
	System.out.println(mark);
	System.out.println(testScore);
	return 0;
	}
	
	//Try/ multi catch method
	public double markwithMultiCatch(String markScored) {
		

		Object strMark = Integer.valueOf(45);
		int mark=0;
		double testScore= 0.0;
		try {
		    mark = (Integer)strMark;
			
			testScore = Double.parseDouble(markScored);
		} catch (NumberFormatException | ClassCastException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(mark);
		System.out.println(testScore);
		return 0;
		}
	
	public String exampleforDeclare(String name) throws NullPointerException{
		
		return name.toUpperCase(); 
	}
	
}
