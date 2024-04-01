package com.cooki;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 PrintWriter po=resp.getWriter();
	 
	 //getting all the cookies.
	 
	Cookie[] cookies= req.getCookies();
	boolean f=false;
	String name="";
	if(cookies==null)
	{
		po.println("<h1>You are new user go to home page anad sumbit your name: </h1>");
		return;
	}
	else {
		for(Cookie c:cookies)
		{
			
		String tname=c.getName();
		if(tname.equals("user_name"))
		{
			f=true;
			name=c.getValue();
		}
			
		}
	}
	if(f) {
	 po.println("<h1>HEllo,"+name+" welcome to my website....</h1>");
	 po.println("<h1>Thank You!!</h1>");
	}
	else {
		po.println("<h1>You are new user go to home page anad sumbit your name: ");
	}
}
}
