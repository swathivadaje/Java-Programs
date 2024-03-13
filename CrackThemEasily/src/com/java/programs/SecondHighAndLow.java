package com.java.programs;

import java.util.Arrays;

public class SecondHighAndLow
{

	public static void main(String[] args)
	{
		int[] num =	{ 2, 4, 1, 5, 88, 32, 79, 99,99, 11, 111 };

		if (num.length == 0)
		{
			System.out.println("Array is empty....");
			return;
		}

		for (int i = 0; i < num.length; i++)
			for (int j = i + 1; j < num.length; j++)
			{
				int temp;
				if (num[i] > num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}

			}
		System.out.println("Second Lowest: " + num[1]);
		System.out.println("Second Hihghest: " + num[num.length-2]);
		
		System.out.println();
		System.out.println("Using Array function");
		Arrays.parallelSort(num);
		System.out.println(num[1]);
		System.out.println(num[num.length-2]);
	}

}
