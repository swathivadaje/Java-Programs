package com.java.programs;

public class CheckIsNumeric {

	public static void main(String[] args) {

		String num = "1a2b3c45a";
		
		for(int i=0; i<num.length(); i++)
		{
			System.out.println(Character.isDigit(num.charAt(i)));
				
			//System.out.println(Character.isLetterOrDigit(num.charAt(i)));
		}
		
		
	}

}
