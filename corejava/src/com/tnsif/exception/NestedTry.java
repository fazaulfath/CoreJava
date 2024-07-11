package com.tnsif.exception;

public class NestedTry {
	public static void check()
	{
		String str = "tns";
		int arr[] = null;
		int y = 6;
		try //outer try
		{
			//int z = y/0;
			System.out.println(arr[0]);
			System.out.println(str.charAt(y));
//			try //inner try
//			{
//				System.out.println(arr[0]);
//				System.out.println(str.charAt(y));
//			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("exception caught  " + e.getMessage());
			}
			catch(NullPointerException e)
			{
				System.out.println("exception caught  " + e.getMessage());
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught  " + e.getMessage());
		}
		
	}
}
