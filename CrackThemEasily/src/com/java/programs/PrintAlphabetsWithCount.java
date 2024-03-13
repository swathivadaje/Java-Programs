package com.java.programs;
// Print the count of alphabets to shorten the string (aaaddddc = a3d4c1)

public class PrintAlphabetsWithCount
{

	public static void main(String[] args)
	{
		String s = "aaaaabbbbbcccdddceeefg";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++)
		{
			int j = i + 1;
			if (s.charAt(i) == s.charAt(j))
			{
				count += 1;

			} else
			{
				System.out.println(s.charAt(i) + " " + count);
				count = 1;
			}

			if (j == s.length() - 1)
			{
				System.out.println(s.charAt(j) + " " + count);
			}
		}
	}

}
