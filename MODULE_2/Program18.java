package com.Assignment2;
class Member 
{	  
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;  
    public Member(String name, int age, String phoneNumber, String address, double salary)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public double getSalary() 
    {
        return salary;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

public class Program18 
{
	
	   public static void main(String[] args)
	    {
	        Member m1 = new Member("Himanshu",21,"9829627400"," Dungarpur Rajasthan",90000);
	        m1.display();
	    }
}
 