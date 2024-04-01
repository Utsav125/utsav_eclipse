package com.basic.dispatch;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String em=req.getParameter("em");
		String ps=req.getParameter("ps");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		RequestDispatcher rd;
		
		if("demo@gmail.com".equals(em) && "demo".equals(ps))
		{
			//home page redirect
			rd=req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
		}
		else {
			//redirect login page
			out.print("<h4>Invalid Id OR Password</h4>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	} 

}
