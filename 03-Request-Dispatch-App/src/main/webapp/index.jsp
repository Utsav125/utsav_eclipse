<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.lang.String" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a=50;
int b=10;
String name="techsoft india";

public int doSum()
{
	return a+b;
}
public String revese()
{
	StringBuffer br=new StringBuffer(name);
	return br.reverse().toString();
}
%>

<%
  out.println(a);
  out.println("<br>");
  out.println(b);
  out.println("<br>");
  out.println("Sum is: "+doSum());
  out.println("<br>");
  out.println(revese());
%>

<h1 style="color:red;">Sum is : <%=doSum() %></h1>
<h1><%=a %></h1>
<h1><%=name %></h1>
</body>
</html>