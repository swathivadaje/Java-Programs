package com.java.programs;

public class ReverseWords
{

	public static void main(String[] args)
	{
		String s = "Java Programing is easy";
		System.out.println(s);
		revString(s);
		System.out.println();
		revWords(s);

	}

	static void revString(String s)
	{
		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));
	}

	static void revWords(String s)
	{
		String[] str = s.split(" ");
		for (String subStr : str)
		{
			revString(subStr);
			System.out.print(" ");
		}
	}

}
