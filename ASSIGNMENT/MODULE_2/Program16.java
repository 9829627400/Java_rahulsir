package com.Assignment2;
class AreaCalculator 
{
    public void calculateArea(int side)
    {
        int area = side * side;
        System.out.println("Area of square with side " + side + ": " + area);
    }
    public void calculateArea(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + ": " + area);
    }
}

public class Program16 
{
	public static void main(String[] args) 
	{
		AreaCalculator c1 = new AreaCalculator();
        c1.calculateArea(5);
        c1.calculateArea(4, 6);
		
	}
	
}
