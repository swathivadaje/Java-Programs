package com.java.programs;

public class LinearSearch
{

	public static void main(String[] args)
	{
		int arr[] = {100,20,30,40,50};  
        int key = 10;  
        for(int i=0; i<=arr.length-1; i++) 
        {
        	if(arr[i]==key)
        	{
        		System.out.println("Element found at index: " + i);
        	return;
        	}
        }
        System.out.println("Element not found");
        
	}

}
