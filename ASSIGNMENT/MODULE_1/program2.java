package com.Assignment1;
import java.util.Scanner;

public class program2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//scanner class
		System.out.println("Enter the Single Character from the Alphabet :-");
		String n=sc.nextLine();
		
		char ch =n.charAt(0);//get char
		
		
		 if (n.length() != 1) { // string length does not equals to more than one.
	            System.out.println("Error: Please enter a single character.");
		 }	
		 else
		 {
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') //vowel
			{
				System.out.println(ch+" is Vowel");
				
			}
				else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') //consonant
			{
				System.out.println(ch+" is Consonant");
			}
				else {
					System.out.println("Error");
				}
			 
		 }
       
								

	}

}



