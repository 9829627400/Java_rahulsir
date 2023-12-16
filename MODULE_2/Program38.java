package com.Assignment2;
class thread1 extends Thread 
{
    @Override
    public void run()
    {
        try 
        {
            Thread.sleep(2000);
            System.out.println("Thread " + Thread.currentThread().getId() + " is running...");
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
public class Program38 
{
	 public static void main(String[] args)
	 {
	        thread1 th1 = new thread1();
	        thread1 th2 = new thread1();

	        th1.start();
	        th2.start();
	        System.out.println("Main thread continues to run...");
	    }
	
}
