package com.servlet.requestorsendredirec;

import java.io.IOException;

import com.basic.sevlet.MyServ;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/searchbar")
public class Forsendredimethod extends HttpServlet{
@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	 String sear=arg0.getParameter("name1");
	// arg1.sendRedirect("http://www.google.com");
	 //agar apne according search kar wa na hoo jo input liya to ye nich wali quer likho
	 arg1.sendRedirect("http://www.google.com/search?q="+sear);
}
}
