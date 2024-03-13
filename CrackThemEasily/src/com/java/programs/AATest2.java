package com.java.programs;
// Sort Hasmap, 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AATest2
{

	public static void main(String[] args) throws InterruptedException
	{
		int arr[] = {10,20,30,40,50};  
        int key = 50;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);  
	}

	public static void binarySearch(int arr[], int first, int last, int key)
	{
		int mid = (first + last) / 2;
		
		while (first <= last)
		{
			if (arr[mid] < key)
			{
				first = mid + 1;
			} 
			
			else if (arr[mid] == key)
			{
				System.out.println("Element is found at index: " + mid);
				break;
			} 
			
			else
			{
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		
		if (first > last)
		{
			System.out.println("Element is not found!");
		}
	}

}





