package com.attr;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class S1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try (PrintWriter out=resp.getWriter()){
			
			String n1=req.getParameter("n1");
			String n2=req.getParameter("n2");
	
			int nn1=Integer.parseInt(n1);
			int nn2=Integer.parseInt(n2);
			
			//add
			int s=nn1+nn2;
			
			//attribute........
			req.setAttribute("sum", s);
			
			//request...RequestDispatcher
			RequestDispatcher rd=req.getRequestDispatcher("s2");
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
