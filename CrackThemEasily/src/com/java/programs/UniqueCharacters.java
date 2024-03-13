package com.java.programs;

public class UniqueCharacters
{

	public static void main(String[] args)
	{
		String str = "baby is Xcrbabsbabyba crYinging ba baZby";
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.indexOf(str.charAt(i), i+1) != -1 )
			{
				str = str.replaceAll(String.valueOf(str.charAt(i)), "");
				i=0;
			}
		}
		
		System.out.println("Unique characters are: " + str);
	}

}
