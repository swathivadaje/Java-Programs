package com.java.programs;

// Check if no is arm strong (153, 370, 371, 407)
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int rem = 0;
		int cube = 0;
		
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			cube = cube + (rem*rem*rem);
		}
		
		if(cube == temp)
			System.out.println(temp + " Num is Armstrong");
		
		else System.out.println(temp + " Number is NOT Armstrong");
		
	}

}
