package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args)
	{
//		ArrayList ob =  new ArrayList();
//		System.out.println("the size of the arraylist:"+ob.size());
//		ob.add(2);
//		ob.add('c');
//		ob.add(22.35);
//		System.out.println("the elements of the arraylist:"+ob);
//		System.out.println("c exists or not:"+ob.contains('c'));
//		System.out.println("remove element specified:"+ob.remove(0));
//		System.out.println("the elements of the arraylist:"+ob);
		
		ArrayList <String>ob = new ArrayList<String>();
		//ob.add(2); can't add int type
		ob.add("pineapple");
		ob.add("banana");
		ob.add("mango");
		System.out.println("the elements of the arraylist:"+ob);
		Collections.sort(ob);
		System.out.println("the elements of the arraylist:"+ob);
		
		Iterator<String> i = ob.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			String s=i.remove();
			System.out.println(nm);
		}
	}
}
