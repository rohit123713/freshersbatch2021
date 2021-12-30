package com.example.functional;

@FunctionalInterface
public interface Converter<T,R> {

	public R convert(T valueFrom);
	
	public default double update(T valueFrom) {
		
		double result = (double)convert(valueFrom);
		
		return result+100;
	}
	
}
