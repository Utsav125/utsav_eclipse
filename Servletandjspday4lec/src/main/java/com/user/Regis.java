package com.user;

import java.io.IOException;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
public class Regis extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//getting al the incoming detai from the request 
	resp.setContentType("text/html");
	 PrintWriter po=resp.getWriter();
	 String name=req.getParameter("user_name");
	 String pass=req.getParameter("user_pass");
	 String email=req.getParameter("user_email");
	 
	 po.println(name);
      po.println(pass);
      po.println(email);

}
}
