package com.Assignment1;

import java.util.Scanner;

public class program1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1: ");
		int a=sc.nextInt();
		System.out.println("Enter no2: ");
		int b=sc.nextInt();
		System.out.println("Enter no3: ");
		int c=sc.nextInt();
		System.out.println("Greatest no is..");
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greatest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greatest number");
		}
		else
		{
			System.out.println(c+" is greatest number");
		}
			
	}
}
