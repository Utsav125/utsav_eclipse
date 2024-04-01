package com.basic.servlet.ubmitform;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

 
public class RegistrationServ extends javax.servlet.http.HttpServlet{
@Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.setContentType("text/html");
	 PrintWriter po=resp.getWriter();
	 po.println("<h2>Welcome To Register Servlet</h2>");
	 String name=req.getParameter("user_name");
	 String passwordString=req.getParameter("user_pass");
	 String emailString=req.getParameter("user_email");
	 String genderString=req.getParameter("user_gender");
	 String courseString=req.getParameter("user_course");
	 
	 String condString=req.getParameter("condition");
	 po.println(condString);
	 if(condString!=null) {
	 if(condString.equals("checked"))
	 {
		 po.println("<h2>name: +"+name+"</h2>");
		 po.println("<h2>name: +"+passwordString+"</h2>");
		 po.println("<h2>name: +"+emailString+"</h2>");
		 po.println("<h2>name: +"+genderString+"</h2>");
		 po.println("<h2>name: +"+courseString+"</h2>");
	 }
	 else {
		 po.println("<h2>you have not accepted terms and condition</h2>");
	 }
	 }
	 else {
		 po.println("<h2>you have not accepted terms and condition</h2>");

	 }
}
}
