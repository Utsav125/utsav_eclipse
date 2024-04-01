package loginapp;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name1=req.getParameter("name1");
		String passowrd1=req.getParameter("password1");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();  
			RequestDispatcher rd;
			
		if(name1.equals(name1) && passowrd1.equals(passowrd1)) 
		{
				rd=req.getRequestDispatcher("/Servlet2");
				rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			 PrintWriter po=resp.getWriter();
			 po.print("<h1>invalid username or password </h1>");
			   rd=req.getRequestDispatcher("/NewFile.html");
			  rd.include(req, resp);
			
		}
		
		
	}

}