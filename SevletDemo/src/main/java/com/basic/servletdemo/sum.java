package com.basic.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class sum extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int one1=Integer.parseInt(req.getParameter("one"));
		int two1=Integer.parseInt(req.getParameter("two"));
		//String name =req.getParameter("one");
		//String email =req.getParameter("two");
		
		
		int sum=one1+two1;
		req.setAttribute("sum", sum);
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>Sum :"+sum+"</h1>");
		
		//RequestDispatcher rd;
		//rd=req.getRequestDispatcher("/mult");
		//rd.forward(req, resp);
		
		
		
		
		
	}

}