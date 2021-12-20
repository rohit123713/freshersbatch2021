package org.training;

import com.training.BankAccount;

public class SavingsAccount extends BankAccount{

	 private double withdrawn=5000;
	 private double depositupto=100000;
	 private double balance=10000;
	
	public void deposit(double amount) {
		if(amount <=depositupto) {
			System.out.println("deposited amount");
			System.out.println(amount);
			
			System.out.println("balance amount");
			System.out.println(balance+=amount);
		}
		else {
			System.out.println("error");
		}
	}
	
	public void withdraw(double amount) {
		if(balance - amount >= withdrawn) {
			System.out.println("withdrawn amount");
			System.out.println(amount);
			
			System.out.println("balance amount");
			System.out.println(balance-=amount);
		}
		else {
			System.out.println("error");
		}
	}
}
