package com.java.programs;

public class ReverseString {

	public static void main(String[] args) {

		StringMethod("abcdef");
		System.out.println("----------");
		StringBufferMethod("abcdef");

	}

	static void StringBufferMethod(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}

	static void StringMethod(String s) {
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(s.length());

		System.out.println(rev);
	}

}
