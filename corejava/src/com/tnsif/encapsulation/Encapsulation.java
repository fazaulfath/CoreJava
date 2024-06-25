//program to demonstrate encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	//default access specifier
	private int serialNum=10; //data members
	private String name;
	private int age;
	// by using getter and setter, we can access private data members
	
	
//	void show() //member function
//	{
//		System.out.println("Serial number:" + serialNum + "\t Name:" + name+ "\t Age:" + age);
//	}


	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}


	public int getSerialNum() //read the value
	{
		return serialNum;
	}


	public void setSerialNum(int serialNum) //set the value
	{
		this.serialNum = serialNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
}
