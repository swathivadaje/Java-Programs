package com.java.programs;

public class MissingNumbers
{
	public static void main(String args[])
	{

		int[] input = { 2, 3, 5, 5, 7, 9, 9, 9, 3, 2 };
		int[] temp = new int[input.length];

		for (int i : input)
		{
			temp[i] = 1;
		}

		for (int j = 1; j < temp.length; j++)
		{
			if (temp[j] == 0)
				System.out.println(j);
		}

	}

}