package com.collection.demo;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Client {
public static void main(String args[]) {
	Collection c1=new ArrayList();
	Collection c2=new ArrayList();
	 
	System.out.println(c1.isEmpty());
	c1.add("Svce");
	c1.add(1234);
	c1.add(15.5f);
	c1.add(true);
	c1.remove("Svce");//remove a particular object 
	c2.addAll(c1);
	
	System.out.println("c2 element are: "+c2);
	c2.removeAll(c2);
	System.out.println("after remove c2 data: "+c2);
	System.out.println(c1);
	System.out.println(c1.size());
	System.out.println(c1.isEmpty());
	System.out.println(c1.contains("Svce"));
	 
	List list = new ArrayList();
	list.add("Svce");
	list.add(1234);
	list.add(15.5f);
	list.add(true);
	System.out.println(list);
	AbstractList abstractList= new ArrayList();
    abstractList.add("Svce");
	abstractList.add(1234);
	abstractList.add(15.5f);
	abstractList.add(true);
	System.out.println(abstractList);
	ArrayList arrayList=new ArrayList();
	arrayList.add(458);
	arrayList.add("Mahi");
	arrayList.add("Qwerty");
	arrayList.add(854612);
	arrayList.add(15.5f);
	System.out.println(arrayList);
	
}
}