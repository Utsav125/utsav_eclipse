package com.basic.demo_b1_sir;import java.lang.invoke.StringConcatFactory;

public class FuctionTester {
public static void main(String ars[]) {
	int[] array= {1,2,3,4,5};
	SquareMaker squareMaker =item->item*item;//ye increment kar deta hai lemda expresion
	CubeMaker cubeMaker =item->item*item*item;
	for(int i=0;i<array.length;i++)
	{
		System.out.println(squareMaker.square(array[i]));
		 
	}
	for(int i=0;i<array.length;i++)
	{
		System.out.println(cubeMaker.cube(array[i]));
	}
}
}
interface SquareMaker
{
	int square(int item);
}
interface CubeMaker
{
	int cube(int item1);
}
