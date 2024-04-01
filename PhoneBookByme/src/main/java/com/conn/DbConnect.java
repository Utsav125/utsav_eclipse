package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
private static Connection conn;
public static Connection getConn()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/phnbook","root","4093");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	return conn;
}
}
