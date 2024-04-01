package com.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
public class TestDemo1{
	public static void main(String []args) {
		ArrayList<Employee1> a1=new ArrayList<Employee1>();
		Employee1 e1=new Employee1();
		e1.setId(100);
		e1.setName("vinit");
		e1.setCity("khodi");
		e1.setDept("vinu");
		e1.setSalary(3463278);
		Employee1 e2=new Employee1(111, "Utsav", "Barwaha","CSE", 897096);
		a1.add(e1);
		a1.add(e2);
		
		System.out.println("With using Iterator: ");
		Iterator<Employee1> i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("For Each Loop: ");
		for(Employee1 e: a1)
		{
			System.out.println(e);
		}
		
		System.out.println("Using For Loop: ");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
}
}