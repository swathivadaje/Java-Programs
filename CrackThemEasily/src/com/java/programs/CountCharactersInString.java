package com.java.programs;

public class CountCharactersInString 
{
	public static void main(String args[])
	{
		String s = "Java programming atestaa";
		Character c = 'a';
		
		count(s, c);

		
		
	}
	
	static void count(String s, Character c)
	{
		
		s = s.replaceAll("[^" + c + "]", "");
		
		if(s.length() < 1)
			System.out.println("invalid string");
		
		System.out.println("No of " + c + " are: " + s.length());
	}
}
