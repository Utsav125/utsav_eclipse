package com.linkedlist.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesStream {
public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
	Properties p1=new Properties();
	FileInputStream f1=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\CollectionFrameWork\\src\\db.property");
p1.load(f1);
String driver=p1.getProperty("driver");
String con=p1.getProperty("const");
String user=p1.getProperty("user");
String pass=p1.getProperty("pass");
Class.forName(driver);
Connection connection=DriverManager.getConnection(con,user,pass);
System.out.println("Connected");
}
}
