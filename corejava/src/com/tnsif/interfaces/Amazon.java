//program to demonstrate interface
package com.tnsif.interfaces;

public interface Amazon 
{
	void welcome(); //abstract methods
	void thankyou();
	
default void servicCharge()
{
	int amt = 100;
	System.out.println("the service charge is:"+amt);
}

static void aboutUs()
{
	System.out.println("Its a ECommerce Website");
}
}
