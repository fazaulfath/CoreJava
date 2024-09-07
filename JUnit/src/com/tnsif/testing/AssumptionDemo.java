package com.tnsif.testing;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class FirstTest {
	//@Disabled()
	@DisplayName("My name")
	@Test
	void display() {
		System.out.println("My test ");
	}
@DisplayName("12")
@RepeatedTest(4)
@Test
void Hello() {
	System.out.println("greet");
}
//@Disabled()
@Test
void hi() {
	System.out.println(22*23);
}
}