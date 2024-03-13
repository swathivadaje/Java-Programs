package com.java.programs;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber
{

	public static void main(String[] args)
	{
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextBoolean());
		System.out.println(random.nextInt(100));
		System.out.println("-------------");

		int i= ThreadLocalRandom.current().nextInt(100, 200);
		System.out.println(i);
	}

}
