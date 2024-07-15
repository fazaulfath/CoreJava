package com.tnsif.exception;
import java.io.IOException;
import java.sql.SQLException;

public class Throws {
	void display() throws IOException, ArithmeticException{
		//throws keyword is used during method declaration
		throw new ArithmeticException();
//		throw new IOException();
	}
}