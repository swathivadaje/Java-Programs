package com.java.programs;

import java.util.ArrayList;
import java.util.List;

// Print the indexes of the sub string provided

public class SubStrings
{

	public static void main(String[] args)
	{

		String str = "baby is crying babybaby crying bababy is";
		String subStr = "ba";

		check(str, subStr);

	}

	static void check(String str, String subString)
	{
		int index = 0;
		List<Integer> li = new ArrayList<Integer>();

		if (str.length() == 0 || subString.length() == 0)
			return;

		for (int i = 0; i < str.length() - 1; i++)
		{
			if (str.indexOf(subString, index) == -1)
				break;
			// Adding the indexes to list
			li.add(str.indexOf(subString, index));
			index = str.indexOf(subString, index) + 1;
		}
		
		// Print the list items
		for (int x : li)
			System.out.print(x + "  ");

//  	converting list to array
//		Integer[] arr = new Integer[li.size()];
//		arr = li.toArray(arr);

	}
}
