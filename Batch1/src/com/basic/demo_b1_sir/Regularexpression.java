package com.basic.demo_b1_sir;

public class Regularexpression {

	public static void main(String args[]) {
		A ob1 = (a) ->  System.out.println(" called by lambda expression   " + a);
		ob1.show(5);
			
	}
	
}
@FunctionalInterface
interface A{
	public void show(int a);
}
/*
class B implements A{
	public void show() {
		System.out.println("Public show visible now with using functional interfacace...");
	}
}
*/
