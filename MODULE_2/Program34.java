package com.Assignment2;

import java.util.Scanner;

class HimanshuException extends Exception
{
	double amount;
	public  void HimanshuExc(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance=balance + amount;
		System.out.println(amount+" rs deposit..");
	}
	public void withdrawal(double amount) throws HimanshuException
	{
		if(amount<=balance)
		{
			balance = balance - amount;
			System.out.println(amount+" rs withdrawal successfully..");
		}
		else
		{
			double needs=amount - balance;
			throw new HimanshuException();
		}
	}
}


public class Program34 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter amount for deposit...");
		double amount=sc.nextDouble();
		
		a1.deposit(amount);
		
		System.out.println("Enter amount for withdrawal..");
		amount=sc.nextDouble();
		
		try
		{
			a1.withdrawal(amount);
		}
		catch (HimanshuException e)
		{
			System.out.println("Sorry, insufficient balance you need more "+e.amount+"Rs. To perform this transaction"+amount +"rs");
		}
		
	}

}
