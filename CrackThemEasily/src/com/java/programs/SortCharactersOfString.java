package com.java.programs;

// Sort the alphabets of the given string

public class SortCharactersOfString
{

	public static void main(String[] args) throws InterruptedException
	{
		String strng = "hitler woman is learning Java programming language";
		System.out.println("Sort complete string alphabets");
		sort(strng);

		System.out.println("Sort alphabets of the words");
		String[] strs = strng.split(" ");
		for (String str : strs)
			sort(str);
	}

	static void sort(String str)
	{
		char[] arr = str.replace(" ", "").toLowerCase().toCharArray();
		char temp;

		int i = 0;
		while (i < arr.length)
		{
			int j = i + 1;
			while (j < arr.length)
			{
				if (arr[j] < arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.err.println(arr);
	}

}
