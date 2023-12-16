package com.Assignment2;
class TestDaemonThread2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is running. Is daemon: " + isDaemon());
    }
}
public class Program40 
{
	public static void main(String[] args) 
	{
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();

        t1.start();
        t1.setDaemon(true); 
        t2.start();
    }
	}
