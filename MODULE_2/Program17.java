package com.Assignment2;
class ParentClass
{
    public void printParent() 
    {
        System.out.println("This is a parent class");
    }
}
class ChildClass extends ParentClass
{
    public void printChild() 
    {
        System.out.println("This is a child class");
    }
}

public class Program17 
{
	public static void main(String[] args)
	{
		ParentClass p1= new ParentClass();
        p1.printParent();
        ChildClass c1= new ChildClass();
        c1.printChild();
        ParentClass p2 = new ChildClass();
        p2.printParent();
	}

}
 