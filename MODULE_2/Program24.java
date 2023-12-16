package com.Assignment2;abstract class Marks 
{
    abstract double getPercentage();
}

class Student1 extends Marks
{
    private int subject1, subject2, subject3;

    public Student1 (int subject1, int subject2, int subject3) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() 
    {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class Student2 extends Marks 
{
    private int subject1, subject2, subject3, subject4;

    public Student2 (int subject1, int subject2, int subject3, int subject4) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() 
    {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}



public class Program24 
{

	public static void main(String[] args) 
	{
         Student1 S1= new Student1(72, 76, 70);
         Student2 S2= new Student2(85, 50, 97, 98);

        System.out.println("Percentage of Student A: " + S1.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + S2.getPercentage() + "%");
	}

}
