package com.java.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters
{

	public static void main(String[] args)
	{
		String  s = "Mmmother-in-law hitler woman";
		
		//checkDup(s);
		count(s);
		
	}

	static void count(String s)
	{
		if (s == null)
		{
			System.out.println("nothing");
			return;
		}

		if (s.isEmpty())
		{
			System.out.println("Empty string");
			return;
		}

		if (s.length() < 2)
		{
			System.out.println("String contains single character");
			return;
		}

		char words[] = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

	}

	static void checkDup(String s1)
	{
		char[] c = s1.toCharArray();

		Set<Character> set = new HashSet<Character>();

		for (char c1 : c)
			if (set.add(c1) == false)
				System.out.print(" " + c1);

	}

}
