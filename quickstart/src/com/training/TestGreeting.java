package com.training;

public class TestGreeting {

	public static void main(String[] args) {

          Greeting grtObj= new Greeting();
          CurrencyConverter crt= new CurrencyConverter();
          
          System.out.println(crt.USDollartoINR(2));
	}

}
