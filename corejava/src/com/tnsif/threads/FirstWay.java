package com.tnsif.threads;

public class FirstWay extends Thread
{
	public void run()
	{
		System.out.println("creation of thread using Thread class");
	}
	public static void main(String[] args)
	{
		FirstWay ob =  new FirstWay();//new state
		//ob.stop();
		ob.start(); //runnable state
		ob.stop();
		ob.start(); //does not start again
	}
}
