package com.linkedlist.demo;

import java.util.LinkedList;

public class Test {
public static void main(String ars[]) {
	LinkedList<Student> l1=new LinkedList<Student>();
	Student s1=new Student();
	s1.setId(101);
	s1.setName("Tim");
	s1.setCity("HYD");
	s1.setDiv("A");
	
	Student s2=new Student();
	s2.setId(102);
	s2.setName("Joe");
	s2.setCity("Dubai");
	s2.setDiv("B");
	l1.add(s2);
	l1.add(s1);
	l1.remove();
	System.out.println(l1);
	System.out.println("Jasdklnfa");
	System.out.println(l1.getFirst());
}
}
