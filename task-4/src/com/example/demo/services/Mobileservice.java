package com.example.demo.services;

import com.training.demo.model.MobileBill;

public class Mobileservice {

	public int findAmount(MobileBill plan) {
		String mobilePlan= plan.getPlanName();
		
		switch(mobilePlan.toLowerCase()) {
		case "prepaid":
		  return 200;
		case "postpaid":
		   return 300;
		default:
			return 0;
	}
}
}