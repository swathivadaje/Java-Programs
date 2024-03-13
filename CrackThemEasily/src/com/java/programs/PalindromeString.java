package com.java.programs;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "ABCBA";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		
		if(s.equalsIgnoreCase(rev))
			System.out.println(s + " string is Palindrome");
		else System.out.println(s + " string is not a palindrome");
		
	}

}
