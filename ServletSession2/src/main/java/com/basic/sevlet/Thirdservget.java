package com.basic.sevlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class Thirdservget extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String myname=(String)req.getParameter("name1"); 
	String myPass=(String)req.getParameter("pass1");
	if(myname.equals("dada@gmail.com") && myPass.equals("4093"))
	{
		System.out.println("Success");
	}
	else {
		System.out.println("NOT ");
	}
}
}
