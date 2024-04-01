package com.cooki;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
 @Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 PrintWriter po=resp.getWriter();
	 String name=req.getParameter("name");
	 po.println("<h1>HEllo, "+name+" welcome to my website....</h1>");
	 po.println("<h1><a href='servlet2'>Goto Servlet2</h1>");
	 
	 //create a cookie
	 Cookie c=new Cookie("user_name", name);
	 resp.addCookie(c);
}
}
