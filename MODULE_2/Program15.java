package com.Assignment2;

class PrintInteger
{
    public void print(int num, char ch) 
    {
        System.out.println("Integer: " + num + ", Character: " + ch);
    }
    
    public void print(char ch, int num) 
    {
        System.out.println("Character: " + ch + ", Integer: " + num);
    }
}

public class Program15 
	
	{
		public static void main(String[] args) 
		{
			 PrintInteger p1= new PrintInteger();
			 p1.print(10, 'A');
		     p1.print('B', 20);
		}

	}

