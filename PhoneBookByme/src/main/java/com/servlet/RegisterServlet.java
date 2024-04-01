package com.servlet;

import java.io.IOException;

import com.conn.DbConnect;
import com.dao.UserDAO;
import com.entity.User;

import jakarta.servlet.Servlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
 User user=new User(name,email,password);
 
 UserDAO dao=new UserDAO(DbConnect.getConn());
 boolean f= dao.userRegister(user);
 HttpSession session=request.getSession();
 if(f)
 {
	 session.setAttribute("sucssMsg", "User Register Succesfilly");
	 try {
		response.sendRedirect("register.jsp");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// System.out.println("User Register Succesfilly");
 }else {
	 session.setAttribute("sucssMsg", "User is Not Register Succesfilly");
 }

}
}
