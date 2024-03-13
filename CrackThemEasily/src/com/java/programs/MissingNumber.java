package com.java.programs;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = {1,3,4,5,6,7,8,9,10};
		numMissing(a);
		
		
		Arrays.sort(a);
		System.out.println("Smallest and largest nos");
		System.out.println(a[0] + " " + a[a.length-1]);
	}
	
	static void numMissing(int num[])
	{
		int sum = 0;
		int sum1 = 0;
		int missNum = 0;
		
		for(int i=0; i<num.length; i++)
			sum = sum + num[i];
		
		System.out.println(num.length);
		System.out.println(sum);
		
		
		for(int j=0; j<=10; j++)
			sum1 = sum1 + j;
		System.out.println(num.length);
		System.out.println(sum1);
		
		missNum = sum1-sum;
		
		System.out.println("Missing num: " + missNum);
	}

}
