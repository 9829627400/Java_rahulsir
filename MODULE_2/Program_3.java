package com.Assignment2;

import java.util.Scanner;

public class Program_3 
{
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
             System.out.print("Enter a character: ");
              char userInput = scanner.next().charAt(0);
                int asciiValue = (int) userInput;

        System.out.println("The ASCII value of '" + userInput + "' is: " + asciiValue);
     scanner.close();
	}
	}
