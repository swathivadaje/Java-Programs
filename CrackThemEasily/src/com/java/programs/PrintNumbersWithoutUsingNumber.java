package com.java.programs;

public class PrintNumbersWithoutUsingNumber {

	public static void main(String[] args) {

		
		String str1 = "a";
		String str2 = "aaaaaaaaaa";
		
		for(int i = str1.length(); i<= (str2.length()*str2.length()); i++)
			System.out.println(i);
		
//		for(int i=str1.length(); i<='d'; i++)
//			System.out.println(i);
	}

}
