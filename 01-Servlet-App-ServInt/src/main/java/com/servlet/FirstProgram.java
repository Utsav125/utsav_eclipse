package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 

public class FirstProgram implements Servlet{

		public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy Method Call");
	}
 
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init Method Call");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Method Call");
		res.setContentType("text/html");
		PrintWriter po=res.getWriter();
		po.println("welcome Java");
		po.println("Today "+new Date().toString());
		//po.println("<a href="https://www.w3schools.com/">Visit W3Schools.com!</a>");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
