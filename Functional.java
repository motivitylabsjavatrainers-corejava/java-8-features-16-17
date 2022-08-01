package com.fumctionalInterface;

import java.util.function.Function;

public class  Functional{

	public static void main(String args[])
	{
		
		Function<Integer, Double> half = a -> a / 2.0;

		half = half.andThen(a -> 3 * a);

		
		System.out.println(half.apply(10));
	}
}

