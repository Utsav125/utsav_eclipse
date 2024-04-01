package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
public class SecondProgram  extends javax.servlet.GenericServlet{
	@Override
	public void service(javax.servlet.ServletRequest req, javax.servlet.ServletResponse res)
			throws javax.servlet.ServletException, IOException {
		System.out.println("Generic Servlet");
		res.setContentType("text/html");
		PrintWriter po=res.getWriter();
		po.print("Date="+new Date().toString());
		
	}

} 