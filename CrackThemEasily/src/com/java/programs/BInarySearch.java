package com.java.programs;

public class BInarySearch
{

	public static void main(String args[])
	{
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 40;

		binarySearch(arr, key);
	}

	public static void binarySearch(int arr[], int key)
	{
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		int midIndex = (firstIndex + lastIndex) / 2;

		while (firstIndex <= lastIndex)
		{
			if (arr[midIndex] < key)
			{
				firstIndex = midIndex + 1;
			}else 
				if (arr[midIndex] == key)
			{
				System.out.println("Element is found at index: " + midIndex);
				break;
			} else
			{
				lastIndex = midIndex - 1;
			}
			midIndex = (firstIndex + lastIndex) / 2;
		}

		if (firstIndex > lastIndex)
		{
			System.out.println("Element is not found!");
		}
	}

}
