package com.example.demo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> a1=new ArrayList<Employee>();
Address ar=new Address();
ar.setFlatNo(803);
ar.setCity("Pune");
ar.setTashshil("Pune");
ar.setCity("Pune");
ar.setState("MM");
ar.setPincode(451352);
ar.setCountry("India");
ar.setDist("Pune");
Employee e1=new Employee();
e1.setId(121);
e1.setName("Golu");
e1.setDept("CSE");
e1.setSalary(20124);
e1.setAddress(ar);
a1.add(e1);
a1.add(e1);

//System.out.println(a1);
System.out.println(a1.get(1));
System.out.println(a1.contains(e1));
System.out.println(a1.size());
	}

}
