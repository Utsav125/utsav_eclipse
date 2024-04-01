package com.collection.map;

import java.util.TreeMap;

public class Demo1 {
public static void main(String[] args) {
	TreeMap<String, String> t1=new TreeMap<String, String>();
	t1.put("A", "Mahajan");
	t1.put("B", "Utsav");
	t1.put("C", "Golu");
	t1.put("G", "Golu");
	t1.put("D", "Vinit");
	t1.put("E", "Yash");
	System.out.println(t1);
	
	
	TreeMap<Integer, String> t2=new TreeMap<Integer, String>();
	t2.put(1, "Ajay");
	t2.put(2, "joe");
	t2.put(3, "bob");
	t2.put(10, "tom");
	t2.put(5, "tim");
	System.out.println(t2);
	t2.remove(3);
	System.out.println(t2);
	System.out.println(t2.get(1));
	
	TreeMap<String, Product> t3=new TreeMap<>();
	Product p1=new Product(101,"Utsav","This is e",158.2f); 
	Product p2=new Product(102, "Mann", "This is name", 12.2f);
	Product p3=new Product(103, "Kalu", "This", 12.23f);
	Product p4=new Product(104, "Sunny", "name", 12.25f);
	Product p5=new Product();
	p5.setId(105);
	p5.setName("Vinit");
	p5.setDesc("This is Yahu");
	p5.setPrice(156.3f);
	t3.put("TV", p1);
	t3.put("Mobile", p2);
	t3.put("Fridge", p3);
	t3.put("Sofa", p4);
	t3.put("AC", p5);
	System.out.println(t3);
	
}
}