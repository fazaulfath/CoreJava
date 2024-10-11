package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object class is the base class for all the java classes
		Encapsulation ob =  new Encapsulation(); //object creation
//		ob.name = "faza"; //calling variables
//		ob.age = 33;
//		ob.serialNum = 22;
//		ob.show();
		
		ob.setAge(22);
		ob.setName("faza");
		ob.setSerialNum(33);
		System.out.println(ob);
	}
}
