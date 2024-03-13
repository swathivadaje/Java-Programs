package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		method1();
		System.out.println("----------------");
		method2();
		System.out.println("----------------");
		
	}

	static void method1() {
		String s[] = { "aaa", "bbb", "ccc", "aaa", "DDD", "eee", "bbb", "aaa" };
		for (int i = 0; i < s.length; i++)
			for (int j = i + 1; j < s.length; j++)
				if (s[i] == s[j])
					System.out.println("Duplicate element: " + s[i]);

	}
	
	static void method2()
	{
		String s[] = { "aaa", "bbb", "ccc", "aaa", "DDD", "eee", "bbbb" };
		Set<String> set = new HashSet<String>();
		
		for(String name : s)
		{
			if(set.add(name) == false)
				System.out.println("Duplicate element: " + name);
		}
	}
	

	
}
