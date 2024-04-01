package com.arraylist.vijaybhai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class Dada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Studentstu> al=new ArrayList<>();
    Studentstu s1=new Studentstu(121,"Utsav",8);
	Studentstu s2=new Studentstu(122,"Vinit",9);
	Studentstu s3=new Studentstu(123,"Sunil",6);
	Studentstu s4=new Studentstu(124,"Mann",7);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4); 
     ListIterator<Studentstu> li=al.listIterator();
     while(li.hasNext())
	   {
		   System.out.println(li.next());
	   }
    // Collections.sort(al,Collections.reverseOrder());   
	}
}
