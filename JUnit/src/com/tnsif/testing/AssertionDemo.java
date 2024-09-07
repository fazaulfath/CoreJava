package com.tnsif.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AssertionDemo {
	@Test
	public void checkassertequal() {
		int res = 1;
		int exp = 1;
		assertEquals(res,exp);
		
	}
	
	@Test
	public void testcheckassertequal() {
		assertFalse("Hello".contains("M"));
	}
	@Test
	public void testNull() {
		String s = "hello";
		assertNotNull(s);
	}
	

}