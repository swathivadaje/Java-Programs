package com.java.programs;

public class CountBraces {

	public static void main(String[] args) {

		String s = " {()";
		check(s);
	}

	static void check(String s) {
		int match = 0;

		s = s.replaceAll("[^()]", "");
		System.out.println(s);

		if (s.length() < 1)
		{
			System.out.println("String doesnt contain braces ()");
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				match++;
			else if (s.charAt(i) == ')')
				match--;
		}
		
		if (match == 0)
			System.out.println("Braces count matched");

		else
			System.out.println("Braces count didnt match");
		
	}

}
