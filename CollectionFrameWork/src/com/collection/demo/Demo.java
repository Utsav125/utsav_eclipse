package com.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
public static void main(String ars[]) {
	Collection c1=new ArrayList();
	c1.add("Mahajan");
	c1.add("M");
	c1.add("HYD");
	c1.add("TS");
	c1.add("INDIA");
	Collection c2=new ArrayList();
	c2.add("Mahajan");
	c2.add("M");
	c2.add("VIZAG");
	c2.add("AP");
	c2.add("INDIA");
	c2.retainAll(c1);// is me coman chize hi aayegi
	System.out.println(c2);
}
}
