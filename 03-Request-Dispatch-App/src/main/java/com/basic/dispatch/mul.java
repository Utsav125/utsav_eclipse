package com.basic.dispatch;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mult")

public class mul extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int one=Integer.parseInt(req.getParameter("one"));
		int two=Integer.parseInt(req.getParameter("two"));
		
		int sum=(int)req.getAttribute("sum");
			
		int mul= one*two;
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>Sum :"+sum+"</h1>");
		out.println("<h1>Mult :"+mul+"</h1>");
	}

}
