package com.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo{
public static void main(String args[]) {
	List l1=new ArrayList();
	l1.add(654);
	l1.add("Mahajan");
	l1.add("HYD");
	l1.add("54");
	System.out.println(l1);
	Iterator i1=l1.iterator();
	while(i1.hasNext())// it will check particular pointr pe data hai ya nahi hai
	{
		System.out.println(i1.next());
	}
	System.out.println("Index Postion");
	System.out.println(l1.get(0));
	
	l1.add(0,"nani");
	System.out.println(l1);
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
	}
}
}
