//date: 25-6-24
//program to demonstrate encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	//default access specifier - 'default'
	private int serialNum=10; //data members
	private String name; //'S' has to be capital because it is a built-in class in java
	private int age;
	
	void show() //member function; 'System' is a class; 'out' is an obj of 'system' class; 
	{
		System.out.println("Serial number:" + serialNum + "\t Name:" + name+ "\t Age:" + age);
	}

	@Override //prints contents of an object in the form of a string
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	// by using getter and setter, we can access private data members
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
