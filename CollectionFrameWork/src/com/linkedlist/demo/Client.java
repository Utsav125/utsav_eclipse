package com.linkedlist.demo;

import java.util.LinkedList;

public class Client {
public static void main(String ara[]) {
	LinkedList l1=new LinkedList();
	l1.add("KALA");
	l1.add(1234);
	l1.add(453);
	l1.addFirst(12869);
	l1.addLast(1236987);
	l1.add(2,1);
	System.out.println(l1);
	System.out.println("First element from Linked List : "+l1.getFirst());
	System.out.println("First element from Linked List : "+l1.getLast());
}
}
