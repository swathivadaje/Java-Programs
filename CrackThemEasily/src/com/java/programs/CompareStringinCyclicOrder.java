package com.java.programs;

public class CompareStringinCyclicOrder
{
	public static void main(String[] args)
	{
		String str1 = "apple";
		String str2 = "leapp";

		for (int i = 0; i < str1.length(); i++)
		{
			String newStr = str1.substring(1) + str1.charAt(0);
			str1 = newStr;
			if (str2.equals(newStr))
			{
				System.out.println("Match found");
				return;
			}
		}
		System.out.println("Match not found");
	}
}
