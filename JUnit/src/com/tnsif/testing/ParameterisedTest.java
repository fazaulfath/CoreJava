package com.tnsif.testing;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterisedTest {
	@ParameterizedTest
	@ValueSource(strings= {"hi","hello","shalini","hari"})
	void endswithI(String str) {
		assertTrue(str.endsWith("i"));
		
	}

}