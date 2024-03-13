package com.java.programs;

public class PrimeNumber {

	static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
		
	}

	static void getPrimeNUmbers(int limit) {
		for (int i = 2; i < limit; i++)
			if(isPrime(i))
				System.out.println(i);
	}

	public static void main(String[] args) {

		System.out.println("12 is Prime? " + isPrime(11));
		System.out.println(("25 is Prime? " + isPrime(23)));
		
		getPrimeNUmbers(50);

	}

}


//public static void main(String[] args) {
//
//	int num = 11;
//	getNumbers(15);
//
//}
//
//static boolean prime(int n)
//{
//	if(n<=1)
//		return false;
//	for(int i=2; i<n; i++)
//	{
//		if(n%i == 0)
//			return false;
//	}
//	
//	return true;
//}
//
//static void getNumbers(int n1)
//{
//	for(int j=2; j<=n1; j++)
//	{
//		if(prime(j))
//			System.out.println(j + " is a prime number");
//		else
//			System.out.println(j + " Not a prime number");
//	}
//		
//}

