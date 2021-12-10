package com.training;

import com.training.ifaces.Function;

public class TempConverter implements Function {

	@Override
	public double apply(double arg) {
	
		return (arg * (9/5))+32;
	}

}
