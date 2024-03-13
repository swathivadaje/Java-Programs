package com.java.programs;

import java.util.Arrays;
// Compares two strings if they are anagram or not

public class Anagram {

	public static void main(String[] args) {

		String str = "Mother in law ";
		String sub = "hitler woman";

		str = str.replaceAll(" ", "").toLowerCase();
		sub = sub.replaceAll(" ", "").toLowerCase();

		if (str.length() != sub.length()) {
			System.out.println("Strings are not Anagram");
			return;
		}

		char[] ch1 = str.toCharArray();
		char[] ch2 = str.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
	}

}
