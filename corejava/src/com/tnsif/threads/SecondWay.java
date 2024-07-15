package com.tnsif.threads;

public class SecondWay implements Runnable
{
	public static void main(String[] args)
	{
		SecondWay t = new SecondWay(); //new state
		Thread th = new Thread(t);
		th.start();
		//th.start(); //illegal thread exception
		th.run(); //normal method
	}
	
	public void run()
	{
		System.out.println("creation of thread using Running interface");
	}
}
