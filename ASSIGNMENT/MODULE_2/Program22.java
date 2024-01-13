package com.Assignment2;
abstract class Parent 
{
    abstract void message();
}

class FirstSubclass extends Parent
{
    @Override
    void message()
    {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent
{
    @Override
    void message() 
    {
        System.out.println("This is second subclass");
    }
}

public class Program22 
{
	public static void main(String[] args)
{
    FirstSubclass f1 = new FirstSubclass();
    SecondSubclass s1 = new SecondSubclass();

    f1.message();
    s1.message();
}

	
}
