package com.basic.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(145);
	l1.add("fsc");
	l1.add(true);
	
	
	LinkedList<Student> l2=new LinkedList<>();
	Student s1=new Student();
	Address a1=new Address();
	s1.setId(121);
	s1.setName("Utsav");
	s1.setCity("Indore");
   s1.setAddress(a1);
   Student s2=new Student(122, "Sunil", "Indore", a1);
   a1.setFlatno(1258);
   a1.setArea("HYd");
   a1.setCity("INDORE");
   a1.setState("MP");
   Address a2=new Address(152, "KH", "HYd","MUM");
   l2.add(s1);
   l2.add(s2);
   System.out.println(l2);
   ListIterator<Student> li=l2.listIterator();//in listIterator we can do both the think forward and backword Operation asawell as
   while(li.hasNext())
   {
	   System.out.println(li.next());
   }
   	   System.out.println("Reverse");
	   while(li.hasPrevious())
	   {
		   System.out.println(li.previous());
	   }
   }
   

}
