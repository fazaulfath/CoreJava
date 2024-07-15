package com.tnsif.exception;
//user defined exception class
public class Age extends Exception {
	Age(String str){
		super(str);
		System.out.println(str);
	}
}