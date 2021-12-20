package org.training;

import com.training.BankAccount;

public class BusinessAccount extends BankAccount{

    private double withdrawn=25000;
    private double depositupto=1000000;
    private double balance=26000;

    @Override
	public void deposit(double amount) {
		if(amount<=depositupto) {
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

