package com.tnsif.interfaces;

public class NonPrime implements Amazon,Flipkart{

	@Override
	public void welcome() {
		System.out.println("Welcome Non prime member");
		
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("Thank you Non prime member");
	}

}
