package com.servlet;

import java.io.IOException;

import com.conn.DbConnect;
import com.dao.UserDAO;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String email=req.getParameter("email");
       String pass=req.getParameter("password");
       System.out.println(email+"  "+pass);
       UserDAO dao1=new UserDAO(DbConnect.getConn());

      User u= dao1.loginUser(email, pass);
      HttpSession session=req.getSession();
      if(u!=null)
      {
    	 session.setAttribute("user",u); 
    	 resp.sendRedirect("Index.jsp");
      }
      else {
    	  session.setAttribute("inavlidMsg","Invalid Email & Password");
    	  resp.sendRedirect("Login.jsp");
		//System.out.println("User is Not Available="+u);
	}
	}
}
