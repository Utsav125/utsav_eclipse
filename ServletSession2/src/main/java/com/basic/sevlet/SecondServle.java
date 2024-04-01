package com.basic.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitform")
public class SecondServle extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String myname = req.getParameter("name1");
	String myemail = req.getParameter("email1");
System.out.println("Name: "+myname);
System.out.println("Email: "+myemail);

PrintWriter out=res.getWriter();

out.println("Name: = "+myname);
out.println("Email: = "+myemail);
}
}
