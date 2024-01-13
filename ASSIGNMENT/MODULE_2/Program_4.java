package com.Assignment2;

import java.util.Scanner;

public class Program_4 
{
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();
        int result = computeSumOfDigits(n);
        System.out.println("The result of " + n + " + " + (n * 11) + " + " + (n * 111) + " is: " + result);
        scanner.close();
    }
    private static int computeSumOfDigits(int n) {
        return n + (n * 11) + (n * 111);
}
    }
