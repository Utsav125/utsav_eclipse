package com.collection.demo;

import java.util.AbstractList;
import java.util.ArrayList;

public class AbstrctListDemo {
public static void main(String args[]) {
	AbstractList al1=new ArrayList();
	al1.add(4568);
	al1.add("Mahi");
	al1.add(454.256);
	al1.add(7894);
	al1.add(true);
	al1.add(false);
	for(int i=0;i<al1.size();i++)
	{
		System.out.println(al1.get(i));
	}
}
}
