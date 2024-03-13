package com.java.programs;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "The waves are started here";
		String s1 = "THE waves are started here";
		String s3 = "   Hello   World  ";
		String s4 = "12/04/1988";
		String a = "Hello";
		String b = "World";
		int x = 100;
		int y = 200;

		System.out.println("length of the string: " + s.length());
		System.out.println("Character at 5th location: " + s.charAt(5));
		System.out.println("Index of char A is: " + s.indexOf('a'));
		System.out.println("Index of second A is: " + s.indexOf('a', s.indexOf('a')+1));
		System.out.println("Index of Third A is: " +s.indexOf('a', s.indexOf('a', s.indexOf('a')+1)+1));
		System.out.println(("Index of ARE is: " + s.indexOf("are")));
		System.out.println("Index of selenium is: " + s.indexOf("selenium"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println("Sub String: " + s.substring(3, 8));
		System.out.println("Trim: " + s3.trim());
		System.out.println("Replace method: " + s3.replace(" ", ""));
		System.out.println("Replace: "+ s4.replace('/', '-'));
		System.out.print("Split: ");
		String split[] = s3.split(" ");
		for (String str : split)
			System.out.println(str);
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(a+b+(x+y));
		System.out.println(x+y+a+b);
		
		
	}

}
