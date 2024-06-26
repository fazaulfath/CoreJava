//program to demonstrate constructor
package com.tnsif.constructor;

public class Customer 
{
	private int id;
	private String name;
	
	public Customer() //default constructor
	{
		super(); //calls super class constructor or instance variable or method
		System.out.println("----default-----");
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
