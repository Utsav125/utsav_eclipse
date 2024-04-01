package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Client {
	public static void main(String ars[]) {
		List<String> l1=new ArrayList<String>();
		l1.add("HH");
		l1.add("KK");
		ListIterator<String> l=l1.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("Revese the List");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
	}

}
