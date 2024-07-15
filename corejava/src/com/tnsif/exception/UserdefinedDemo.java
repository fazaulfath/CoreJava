package com.tnsif.exception;

public class UserDefinedDemo {
	public static void main(String args[]) {
		try {
			UserDefined.validate();
		}
		catch(Age e) {
			System.out.println("exception raised: "+e.getMessage());
		}
	}

}