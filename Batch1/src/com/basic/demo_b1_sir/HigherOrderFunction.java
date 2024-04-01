package com.basic.demo_b1_sir;

import java.util.function.Function;

public class HigherOrderFunction {
//higher order functions are those function who recieves another functions as argument
	public static void main() {
		
		Function<Integer, Integer > square = t -> t*t; //-> arow function
		Function<Integer, Integer > cube = t -> t*t*t; 
		int[] array= {1,2,3,4,5};
		
		for(int i=0;i<array.length;i++)
		{
			print(square,array[i]);
			 
		}
		for(int i=0;i<array.length;i++)
		{
			print(cube,array[i]);
		}
	} 
private static <T, R>void print(Function<T, R> function, T t)
 {
	System.out.println(function.apply(t));
}
}