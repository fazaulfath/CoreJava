//to demonstrate scanner class
package com.tns.scannerclass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = ob.nextInt();
		if(ob.hasNextInt()) //returns boolean
		{
			System.out.println(id);
		}
		String name = ob.nextLine();
		char a = ob.next().charAt(0);
		
	}

}
