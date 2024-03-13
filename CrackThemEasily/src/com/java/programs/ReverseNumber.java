package com.java.programs;

public class ReverseNumber {

	public static void main(String[] args) {

		revNum(123456);
	}
	
	
	static void revNum(int num)
	{
		int rev = 0;
		while(num != 0)
		{
			rev = rev * 10 + num % 10; 
			num = num / 10;
			
		}
		System.out.println(rev);
	}

}
