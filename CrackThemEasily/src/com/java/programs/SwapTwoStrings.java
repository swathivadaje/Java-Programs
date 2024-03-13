package com.java.programs;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String a = "hello";
		String b = "world";
		swap(a,b);
		
	}
	
	static void swap(String x, String y)
	{
		
		x= x+y;
		y = x.substring(0, x.length()-y.length());
		x = x.substring(y.length());
		System.out.println(x);
		System.out.println(y);
	}

}
