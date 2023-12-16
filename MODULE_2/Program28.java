package com.Assignment2;

import java.util.Scanner;


public class Program28
{
	public static void main(String[] args) 
	{
		int a = 10;
        int b = 1;

        try {
            int result = a / b; // This might throw an ArithmeticException
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error!");
            System.out.println(e.getMessage());
        }

        System.out.println("Program execution continues...");
		
	}

}