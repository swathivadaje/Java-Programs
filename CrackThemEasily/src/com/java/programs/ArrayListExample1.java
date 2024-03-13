package com.java.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("bounce");
		list.add("catalyst");
		list.add("dell");
		list.add("ey");
		
		
		System.out.println("--------------------Using Lamda Expression");
		list.forEach(li -> {
			System.out.println(li);
		});

		
		System.out.println("--------------------using iterator");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		

		System.out.println("--------------------using For Each Remaining");
		Iterator<String> it1 = list.iterator();
		it1.forEachRemaining(li1 -> {
			System.out.println(li1);
		});
		
		
		System.out.println("--------------------using For Each Loop");
		for(String li2 : list)
			System.out.println(li2);
		
		
		System.out.println("--------------------using For Loop");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
	}

}
