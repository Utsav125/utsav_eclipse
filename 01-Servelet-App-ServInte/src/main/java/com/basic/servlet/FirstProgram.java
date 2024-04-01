package com.basic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstProgram implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("I Destroy");
	}

	 
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init method Is Call");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service method is call 2");// agar run  kakr ke bad kuch change karo to ye auto destroy kar dega magar code save kar na honga
	  //ye niche wale code se jab hum link pe click karenge to ye hum ko web page ye message likhe dikh denga
		arg1.setContentType("text/html");
	    PrintWriter out=arg1.getWriter();
	    out.println("welcome to servlet");
	    }
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
