package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters
{

	public static void main(String[] args)
	{
		String str = "Welcomex to Javay programsz Welcome to Java programs";
		str = str.replace(" ", "");
		char[] chars = str.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		for(char c : chars)
		{
			if(!set.add(c))
				System.out.println(c);
		}
		
	}

}
