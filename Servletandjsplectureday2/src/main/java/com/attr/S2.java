package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF=8");
		try (PrintWriter out=resp.getWriter()){
	
			int nn1=Integer.parseInt(req.getParameter("n1"));
			int nn2=Integer.parseInt(req.getParameter("n2"));
			
			//product
			int p=nn1*nn2;
			
			//attribute........
			int sum=(int) req.getAttribute("sum");
			out.println("<h1>");
			 out.println("Sum is= "+sum);
			 out.println("Product is = "+p);
			 out.println("</h1");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
