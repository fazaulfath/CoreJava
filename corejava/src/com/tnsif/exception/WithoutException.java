package com.tnsif.exception;

public class WithoutException 
{
	public static void main(String args[])
	{
		int d = 0;
		
		try 
		{
			int a = 42 / d; //exception raised
			System.out.println("Faza");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception handled successfully " + e.getMessage());
		}
		
	}
}
