package com.Assignment2;

public class Program_8 
{
	    public static void main(String[] args) {
        String originalString = "Himanshu ";
        String appendString = "Panchal";
	    String result = concatenateStrings(originalString ,appendString);
	   System.out.println(result);
	    }
	    private static String concatenateStrings(String str1, String str2) {
	        return str1 + str2;
	    }
}
