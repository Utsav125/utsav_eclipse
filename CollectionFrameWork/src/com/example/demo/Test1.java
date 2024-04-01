package com.example.demo;

import java.util.Stack;

public class Test1 {
public static void main(String arsh[]) {
	Stack<Student> s1=new Stack<Student>();
	Student s=new Student();
	s.setId(11);
	s.setCity("HYD");
	s.setName("Yash");
	s.setDept("CSE");
	s.setState("UP");
	Student s2=new Student(2,"joe","Pune","Dev","MH");
	Student s3=new Student(3,"Toe","Pe","D","M");	
	s1.push(s3);
	s1.push(s2);
	s1.push(s);
	s1.pop();
	
	for(Student ss:s1)
	{
		System.out.println(ss);
	}
	System.out.println(s1.peek());
}
}