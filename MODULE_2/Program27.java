package com.Assignment2;
class A// A=shape
{
    void display() 
    {
        System.out.println("This is shape");
    }
}

class B extends A// B= Rectengular
{
    void display()
    {
        System.out.println("This is rectangular shape");
    }
}

class C extends A //C=circle
{
    void display()
    {
        System.out.println("This is circular shape");
    }
}

class D extends B //D=Square
{
    void displayD() 
    {
        System.out.println("Square is a rectangle");
    }
}
public class Program27 
{
	public static void main(String[] args) 
	{
        D s1 = new D();
        s1.display();
        s1.displayD();
    }

}
