//Try multiple catch block
package com.tnsif.exception;

public class TryCatch 
{
	public static void divide()
	{
		int a = 6, b = 0;
		
		try 
		{
			int c = a / b; //exception raised
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception handled successfully " + e.getMessage());
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception handled successfully " + e.getMessage());
		}
//		catch(NullPointerException e) 
//		{
//			System.out.println("Exception handled " + e.getMessage());
//		}
		catch(Exception e)
		{
			System.out.println("Exception handled successfully " + e.getMessage());
		}
		
	}
}
