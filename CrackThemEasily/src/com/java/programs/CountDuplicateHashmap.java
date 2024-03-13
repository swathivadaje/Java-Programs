package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateHashmap
{

	public static void main(String[] args)
	{

		stringChars();
		
		System.out.println();
		
		numbers();

	}
	
	
	static void stringChars()
	{
		String str = "Todayday is Friday";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] chr = str.toCharArray();

		for (char a : chr)
		{
			if (map.containsKey(a))
			{
				map.replace(a, map.get(a) + 1);
			} else
				map.put(a, 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if (entry.getValue() != 1)
				System.out.println(entry.getKey() + ": " + entry.getValue());

		}
	}
	
	
	
	static void numbers()
	{
		long num= 1121233142;
		String str = Long.toString(num);
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		
		for(Character c : ch)
		{
			if(map.containsKey(c))
				map.replace(c, map.get(c)+1);
			else map.put(c, 1);
			
		}

		for(Map.Entry<Character, Integer> entry : map.entrySet())
//			if(entry.getValue()>1)
			System.out.println(entry.getKey() + " " + entry.getValue());
	
	}

}
