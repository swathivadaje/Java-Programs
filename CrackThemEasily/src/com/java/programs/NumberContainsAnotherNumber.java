package com.java.programs;

public class NumberContainsAnotherNumber
{

	public static void main(String[] args)
	{

		int num = 1;
		
		for (int i = 0; i <= 100; i++) 
		{
			String tmp = String.valueOf(i);
			if (tmp.contains(String.valueOf(num)))
				System.out.println(tmp);

		}
		
	}

}
