package com.java.programs;

public class PalindromeAndPrime
{
	public static void main(String[] args)
	{
		for (int j = 101; j <= 99999; j++)
		{
			if (palindrome(j) && primeNum(j))
				System.out.println(j + " Number is Palin and Prime");
		}
	}

	
	static boolean palindrome(int num)
	{
		int originalNum = num;
		int rev = 0;
		while (num != 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (originalNum == rev)
			return true;
		else
			return false;
	}

	static boolean primeNum(int num1)
	{
		int count = 0;
		for (int i = 2; i < num1; i++)
		{
			if (num1 % i == 0)
				count++;
		}
		if (count > 0)
			return false;
		else
			return true;
	}

}
