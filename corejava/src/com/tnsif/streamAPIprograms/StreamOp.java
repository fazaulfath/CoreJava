package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOp 
{
	public static void main(String[] args)
	{
		Integer[] values =  new Integer[] {1,2,3,4,5};
		Stream<Integer> stream = Arrays.stream(values);
		
		//map function
		System.out.println("Square of a number"+Arrays.toString(values));
		
		stream.map(num->num*num).forEach(System.out::println);
		stream.map(num->num*num).filter(ele->ele%2==0).forEach(ele->System.out.println(ele));
		
		Stream<Integer> streams = Arrays.stream(values);
		streams.filter(ele->ele%2==0).forEach(System.out::println);
		
		System.out.println("limit op:");
		Integer[] valu =  new Integer[] {1,2,3,4,5};
		Stream<Integer> streamsobj = Arrays.stream(valu);
		
		System.out.println("skip first 2 ele");
		Arrays.stream(valu).skip(2).forEach(System.out::println);
		
		
		
	}
}
