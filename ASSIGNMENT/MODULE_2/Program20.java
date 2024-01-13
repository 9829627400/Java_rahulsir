package com.Assignment2;
class Triangle 
{
    private double side1, side2, side3;

    public Triangle() 
    {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public void calculateArea() 
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of Triangle: " + area);
    }

    public void calculatePerimeter()
    {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}

public class Program20 
{
	 public static void main(String[] args) 
	 {
	        Triangle t1 = new Triangle();
	        t1.calculateArea();
	        t1.calculatePerimeter();
	    }
	
}
