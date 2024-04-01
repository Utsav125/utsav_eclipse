package com.basic.dispatch;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sum")
public class sum extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int one=Integer.parseInt(req.getParameter("one"));
		int two=Integer.parseInt(req.getParameter("two"));
		int sum=one+two;
req.setAttribute("sum", sum);
		
		RequestDispatcher rd;
		rd=req.getRequestDispatcher("/mult");
		rd.forward(req, resp);


	}
}
