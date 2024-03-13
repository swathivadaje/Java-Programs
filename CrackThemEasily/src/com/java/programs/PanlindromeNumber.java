package com.java.programs;

public class PanlindromeNumber {
	public static void main(String args[])
	{
		int num = 112311;
		int originalNum = num;
		int rev = 0;
		
		while (num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if (originalNum == rev)
			System.out.println(originalNum + " is a palindrome");
		else System.out.println(originalNum + " is NOT a palindrome");
	}

}
