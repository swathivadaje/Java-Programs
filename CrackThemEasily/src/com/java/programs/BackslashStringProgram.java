package com.java.programs;

// Find the # and insert treat it as BackSlash (delete the previous character of #)

public class BackslashStringProgram
{
	public static void main(String[] args)
	{
		String s = "##Abcd#dd#";
		if (s.length() <= 1)
		{
			System.out.println("Enter valid string");
			return;
		}
		
		while (s.indexOf('#') != -1)
		{
			if (s.indexOf('#') == 0)
				s = s.substring(1);
			else
				s = s.substring(0, s.indexOf('#') - 1) + s.substring(s.indexOf('#') + 1);
		}
		System.out.println(s);
	}
}
