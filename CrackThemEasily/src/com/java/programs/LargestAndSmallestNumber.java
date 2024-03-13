package com.java.programs;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {

		int numbers[] = { 111, 24, 3, 4, 78, 99, 11 };
		largestSmallest(numbers);

	}

	private static void largestSmallest(int num[]) {
		int smallest = num[0];
		int largest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest)
				largest = num[i];
			else if (num[i] < smallest)
				smallest = num[i];
		}

		System.out.println("Largest number:  " + largest);
		System.out.print("Smallest number: " + smallest);
	}

}
