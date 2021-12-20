package com.example.demo;

public class application {

	public static void main(String[] args) {
		
//          String bestCity = "Chennai";
//          String prefCity = "Chennai";
//          
//          System.out.println("Using double equals =>"+ (bestCity==prefCity));
//          
//          System.out.println("Using dot.equals =>" + bestCity.equals(prefCity));
//          
//          String greatCity = prefCity;
//          
//          System.out.println("Comparing greatCity and prefCity (==) =>" + (greatCity==prefCity));
//          
//          System.out.println("Comparing greatCity and prefCity using dot.equals =>" + greatCity.equals(prefCity));
//          
//          System.out.println("==== using String objects ====");
//          
//          String city1= new String("Chennai");
//          String city2= new String("Chennai");
//          
//          System.out.println("Using double equals =>" + (city1==city2));
//          System.out.println("Using dot.equals =>" + city1.equals(city2));
          
          
          System.out.println(StringUtility.joinTwoStrings("Hello", "world"));
          try {
			System.out.println(StringUtility.getSubString("Universe",2,7) );
		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.err.println("Please enter the index which is in range");
			e.printStackTrace();
		}
          
          System.out.println(StringUtility.getSubString("Universe",2));
          System.out.println(StringUtility.checkContains("helloworld", "hello"));
          
          System.out.println(StringUtility.checkPositionOfChar("universe", 'e'));
          
          System.out.println(StringUtility.replaceString("HELLO", "JAVA"));
          
          String names= "for;the;world;universe";
          
          String[] splited = StringUtility.splitString(names, ";");
          
          for(String object:splited) {
        	  System.out.println(object);
          }
          
          System.out.println(StringUtility.compareTo("hello", "hello"));
          
          System.out.println(StringUtility.trimmethod("  hello java  "));
         
          System.out.println(StringUtility.lengthOf("javaworld"));
          
          System.out.println(StringUtility.toupperCase("forever"));
      
          System.out.println(StringUtility.tolowerCase("forever"));
	}

}
