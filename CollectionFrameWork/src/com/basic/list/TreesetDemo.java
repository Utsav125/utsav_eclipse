package com.basic.list;

import java.util.TreeSet;

public class TreesetDemo {
public static void main(String[] args) {
	TreeSet<Employee> t1=new TreeSet<>(new Employee());
	Employee e1=new Employee();
	e1.setId(101);
	e1.setName("Golu");
	e1.setCity("Indore");
	e1.setSalary(125.2f);
	t1.add(e1);
	System.out.println(e1);// ye error dega kyo ki is ko different type of  data hai na is karan
	Employee e2=new Employee();
	e2.setId(102);
	e2.setName("Vinit");
	e2.setCity("Indore");
	e2.setSalary(125.3f);
	t1.add(e2);
	System.out.println(e2);
	
	Employee e3=new Employee();
	e3.setId(103);
	e3.setName("Sunil");
	e3.setCity("Indore");
	e3.setSalary(125.f);
	t1.add(e3);
	System.out.println(e3);
}
}
