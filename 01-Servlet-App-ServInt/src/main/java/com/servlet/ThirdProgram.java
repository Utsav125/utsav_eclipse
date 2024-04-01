package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdProgram extends HttpServlet{
 
/*
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	 System.out.println("HTTP Servlet is Calling");
	 res.setContentType("text/html");
	 PrintWriter po=res.getWriter();
	 po.println("Http Servlet");
}
*/
	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("Doget Method is Calling Now");
		// TODO Auto-generated method stub
	//super.doGet(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("doPost Method");
	// TODO Auto-generated method stub
		//super.doPost(req, resp);
	}
}
