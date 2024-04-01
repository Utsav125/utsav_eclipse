package com.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
//hetrozenious data means differed type of data we are using
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList al1=new ArrayList();
       al1.add("Sdgf");
       al1.add("dgf");
       al1.add("ajay");
       al1.add(2545);
       al1.add(458.5f);
       al1.add(true);
       al1.add(false);
       //Methods to print data from COllection objecst
       // 1. for loop.
       // 2. for eachloop
       // 3. iterator()
       // 4. direct way System.out.println(al1);
       System.out.println("Printing values using iterator:->");
       Iterator iterator1=al1.iterator();
       while(iterator1.hasNext()) {
    	   System.out.println(iterator1.next());
       }
       ArrayList<String> al2=new ArrayList<String>();//jaha pe data type lagana ho ya jenaric type of data 
       al2.add("Golu");
       al2.add("Indore");
       al2.add(null);
       for(String string : al2)
       {
    	   System.out.println();
       System.out.println(string);
       }
	}

}
