package com.example.demo;

public class StringUtility {

	
	public static String getSubString(String arg, int charBegin) {
		return arg.substring(charBegin);
	}
	public static String getSubString(String arg, int charBegin,int charEnd) {
		return arg.substring(charBegin, charEnd);
	}
	
	public static boolean checkContains(String arg, String srchChar) {
		return arg.contains(srchChar);
	}
	
	public static int checkPositionOfChar(String arg, char srchChar) {
		return arg.indexOf(srchChar);
	}
	
	public static String joinTwoStrings(String str1,String str2) {
		return str1.concat(str2);
	}
	
	public static String replaceString(String originalString, String replaceString) {
		return replaceString.replaceFirst(replaceString, originalString);
	}
	
	public static String[] splitString(String str1, String str2) {
	
		return str1.split(str2);
	}
	
	public static boolean compareTo(String str1, String str2) {
		
		if(str1.compareTo(str2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String trimmethod(String str1) {
		
		return str1.trim();
	}
	
	public static int lengthOf(String str1) {
		return str1.length();
	}
	
	public static String toupperCase(String str1) {
		return str1.toUpperCase();
	}
	
	public static String tolowerCase(String str1) {
		return str1.toLowerCase();
	}
}
