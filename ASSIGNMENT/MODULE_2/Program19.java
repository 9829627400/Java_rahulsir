package com.Assignment2;
class Rectangle 
{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea()
    {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calculatePerimeter()
    {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Rectangle 
{
    public Square(double side)
    {
        super(side, side);
    }
}
public class Program19 

	{
		 public static void main(String[] args) 
		 {
		        Rectangle r1 = new Rectangle(4, 6);
		        r1.calculateArea();
		        r1.calculatePerimeter();
		        System.out.println();
		        Square s1 = new Square(5);
		        s1.calculateArea();
		        s1.calculatePerimeter();
		 }
	}
	

