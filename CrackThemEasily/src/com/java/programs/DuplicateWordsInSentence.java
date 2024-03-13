package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInSentence {

	public static void main(String[] args) {

		String s = "Hello this is hello this is a program to find hello a duplicate word";
		dupSting(s);
	}

	static void dupSting(String str) {
		
		String words[] = str.split(" ");
		Set<String> set = new HashSet<String>();
		for (String word : words) 
		{
			if(set.add(word) == false)
				System.out.println("Duplicate: "+ word);

		}

	}

}
