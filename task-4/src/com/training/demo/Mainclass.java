package com.training.demo;

import com.example.demo.services.Mobileservice;
import com.training.demo.model.Address;
import com.training.demo.model.MobileBill;

public class Mainclass {

	public static void main(String[] args) {
		
		Address address= new Address(24,12,"Chennai","TamilNadu",67124);
		MobileBill bill= new MobileBill("Uttej",94563827, "Prepaid",address);
       
		Mobileservice service= new Mobileservice();
		System.out.println(service.findAmount(bill));
		System.out.println(bill.getCustomerName() + bill.getMobileNumber() );
		
		System.out.println(bill.getAddress().getPinCode() + bill.getAddress().getState() );
	}

}
