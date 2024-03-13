package com.java.programs;
//You are given a list of strings, each has a number at the end of the string which indicates its relative order in the original message. 

//Write a function to decrpyt the given message and print the orignial one.
//The numbers are unique one digit.
//E.g.
//"Super5 is3 Star9 Bob2 a4" is the encrypted message. The orignal message is "Bob is a Super Star"

public class DecryptMessage
{

	public static void main(String[] args)
	{
		String string1 = "Super5 is3 Star9 Bob2 a4";
		String[] str1 = string1.split(" ");

		for (int i = 0; i <= str1.length - 1; i++)
			for (int j = 0; j <= str1.length - 1; j++)
			{
				if (str1[i].charAt(str1[i].length() - 1) < str1[j].charAt(str1[j].length() - 1))
				{
					String temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		for (String s : str1)
			System.out.println(s);
	}

}
