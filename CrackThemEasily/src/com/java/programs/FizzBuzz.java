package com.java.programs;

public class FizzBuzz
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int n = 100;

		for (int i = 1; i <= n; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.print("FizzBuzz");
			} else if (i % 3 == 0)
			{
				System.out.print("Fizz");
			} else if (i % 5 == 0)
			{
				System.out.print("Buzz");
			} else
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}

}
