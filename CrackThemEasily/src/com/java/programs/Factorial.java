package com.java.programs;

public class Factorial {

	public static void main(String[] args) {

		
		usingLoop(3);
		System.out.println(usingRecurssion(5));
	}

	static void usingLoop(int num) 
	{
		if(num == 0)
			System.out.println("Invalid numner");
		int i, fact = 1;
		for (i = 1; i <= num; i++)
			fact = fact * i;
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	static int usingRecurssion(int num)
	{
		int fact = 1;
		if(num == 0)
			return 1;
		else
			return(num * (usingRecurssion(num-1)));
		
		
	}
}
