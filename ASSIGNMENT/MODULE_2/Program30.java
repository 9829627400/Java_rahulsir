package com.Assignment2;

public class Program30 
{
	public class MultipleCatchBlocksDemo {
	    public static void main(String[] args) 
	    {
	        try {
	            int[] a = new int[5];
	            a[5] = 30 / 0; 
	            } catch (ArrayIndexOutOfBoundsException e) {
	            
	            System.out.println("Error: Array index out of bounds.");
	        } catch (ArithmeticException e) {
	          
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (Exception e) {
	          
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}
}


