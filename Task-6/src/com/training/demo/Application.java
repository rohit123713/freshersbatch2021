package com.training.demo;

import org.training.BusinessAccount;
import org.training.SavingsAccount;

import com.training.BankAccount;

public class Application {

	public static void main(String[] args) {
		
        BankAccount account1= new SavingsAccount();
        
        BankAccount account2= new BusinessAccount();
        
        account1.deposit(3000);
        
       account1.withdraw(1000);
        
        account2.deposit(3000);
        
       account2.withdraw(1000);
	}

}
