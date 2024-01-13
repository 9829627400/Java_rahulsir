package com.Assignment2;

import java.util.Scanner;

public class program_1 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        long number = scanner.nextLong();

        if (number > 0) {
            int digitCount = countDigit(number);
            System.out.println("Number of digits: " + digitCount);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }

    private static int countDigit(long number) 
    {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
