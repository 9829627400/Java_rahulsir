package com.Assignment2;

public class program_7 
{
	 
		    public static void main(String[] args) {
		    	String originalString = "Tops Technologies";
	        getCharacterAtIndex(originalString, 0);
		        getCharacterAtIndex(originalString, 10);
		    }
		    	    private static void getCharacterAtIndex(String str, int index) {
		        if (index >= 0 && index < str.length()) {
		            char character = str.charAt(index);
		            System.out.println("The character at position " + index + " is " + character);
		        } else {
		            System.out.println("Invalid index: " + index);
		        }
}}
