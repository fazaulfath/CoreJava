package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//of method
		Stream<Integer> ob = Stream.of(10,20,30,40,50);
		System.out.println(ob);
		ob.forEach(System.out::println);
		
		//stream method
		Integer[] values = new Integer[] {2,3,4,5,6};
		ob = Arrays.stream(values);
		ob.forEach(System.out::println);
	}

}
