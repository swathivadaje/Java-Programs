package com.java.programs;

public class Patterns
{

	public static void main(String[] args)
	{

		stars();
		charactersCaps();
		charactersSmall();
	}

	static void charactersSmall()
	{
		int alpha = 97;

		for (int i = 0; i <= 5; i++)
		{
			for (int j = 5; j >= i; j--)
			{
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println("");
		}

	}

	static void charactersCaps()
	{
		int alpha = 65;
		for (int i = 0; i <= 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println("");
		}

	}

	static void stars()
	{
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 4; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println("");

		}
	}

}
