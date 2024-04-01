package com.example.demo;

import java.util.Stack;

import javax.naming.directory.SearchResult;

public class StackDemo {
	public static void main(String[] args) {
		Stack s1=new Stack<>();
		System.out.println(s1.isEmpty());
		s1.push("utsav");
		s1.push("khodi");
		s1.push(2324);
		s1.push("true");
		s1.push(453.3f);
		s1.push("false");
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.search("utsav"));
		
		}
}
