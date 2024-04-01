package com.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		 
		System.out.println(c1.isEmpty());
		c1.add("Svce");
		c1.add(1234);
		c1.add(15.5f);
		c1.add(true);
		//c1.retainAll(c1);// ye tempory data ko remove karega
		System.out.println(c1);
		c1.clear();
		System.out.println(c1.size());
		
	}

}
