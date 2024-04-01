package com.basic.list;

import java.util.HashSet;
import java.util.TreeSet;

public class ClientFORSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet t1=new TreeSet();
t1.add(123);
t1.add(0);
t1.add(10);
t1.add(50);
t1.add(123);
System.out.println(t1);

 TreeSet<String> t2=new TreeSet<String>();
 t2.add("Demo");
 t2.add("Sunny");
 t2.add("Utsav");
 t2.add("Vinit");
 t2.add("Umesh");
 t2.add("Utsav");
 t2.add("demo");
 System.out.println(t2);
 TreeSet t3=new TreeSet();
 //t3.add(123);
 //t3.add("hemllo");
 //t3.add(true);
 //t3.add(15.2f);
 
 System.out.println(t3);
	}
}
