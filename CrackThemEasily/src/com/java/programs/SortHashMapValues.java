package com.java.programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// Sort the valus in ascending order
public class SortHashMapValues
{

	public static void main(String[] args)
	{

		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		hm1.put('m', 93);
		hm1.put('o', 92);
		hm1.put('n', 90);
		hm1.put('a', 94);
		hm1.put('e', 91);
		hm1.put('j', 95);

		for (Map.Entry<Character, Integer> ent : hm1.entrySet())
		{
			System.out.println(ent.getKey() + "=" + ent.getValue());
		}
		System.out.println("-------------------------");

		HashMap<Character, Integer> hm2 = sortByValue(hm1);
		 
        // print the sorted hashmap
        for (Entry<Character, Integer> en : hm2.entrySet()) {
            System.out.println(en.getKey() +"="+ en.getValue());
        }
	}

	public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm1)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(hm1.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>()
		{
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
		for (Entry<Character, Integer> aa : list)
		{
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
