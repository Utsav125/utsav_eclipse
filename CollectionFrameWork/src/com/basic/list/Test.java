package com.basic.list;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList l=new LinkedList();
   l.add(123);
   l.add(55);
   l.offerFirst(99);
   //System.out.println(l);
   l.add(0);
  // System.out.println(l);
   l.offerLast(88);
 //  System.out.println(l);
   l.offer(85);
 //  System.out.println(l);
   l.offerLast(3);
  // System.out.println(l);
   l.add(1);
  // System.out.println(l);
   System.out.println("With using foreach loop");
   for(Object obj:l)
   {
	   System.out.print(obj);
   }
	}

}
