package com.java.programs;

public class RemoveJunkCharacters {

	public static void main(String[] args) {

		replaceAll("qwerty!@#$%12345678");
		
	}

	static void replaceAll(String s)
	{
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}
