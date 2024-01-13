package com.Assignment2;
class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) 
    {
        super(message);
    }
}

class NameNotValidException extends Exception
{
    public NameNotValidException(String message)
    {
        super(message);
    }
}

class Student 
{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
    {
        if (age < 15 || age > 21)
        {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException: Age should be between 15 and 21.");
        }

        if (!isValidName(name)) 
        {
            throw new NameNotValidException("NameNotValidException: Name should not contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name)
    {
        return name.matches("[a-zA-Z ]+");
    }

    public void displayDetails()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class Program35 

{
	public static void main(String[] args) 
	{
        try 
        {
            Student validStudent = new Student(04, "HIMANSHU", 20, "Computer Science");
            validStudent.displayDetails();

            Student invalidAgeStudent = new Student(010, "NEET", 14, "BAS");
            invalidAgeStudent.displayDetails(); 
        } 
        catch (AgeNotWithinRangeException | NameNotValidException e)
        {
            System.out.println(e.getMessage());
        }
    }

	
}
