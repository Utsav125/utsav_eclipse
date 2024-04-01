package com.basic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondProgram extends GenericServlet{
 
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Generic Servlet Is Working");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
	   out.println("This Is Generic Servlet");	
	}

}
