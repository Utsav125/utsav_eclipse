package com.basic.dataInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {
public static void main(String[] args) {
	try{
        System.out.println("HII BHOLU");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Open");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/svce","root","4093");
        System.out.println("Connection stablish");
      //  String insert="insert into dadi2(id,name,city,Country) values(?,?,?,?);";
        PreparedStatement pr=con.prepareStatement("insert into dadi2(id,name,city,Country) values(?,?,?,?);");
        Scanner s1=new Scanner(System.in);
		System.out.println("enter the ID: ");
		int id=s1.nextInt();
	      s1.nextLine();
		System.out.println("enter the Name");
		String name=s1.nextLine();
		System.out.println("enter the City");
		String city=s1.nextLine();
		System.out.println("enter the country");
		String Country=s1.nextLine();
		pr.setInt(1, id);
		pr.setString(2,name);
		pr.setString(3, city);
		pr.setString(4, Country);
		int i=pr.executeUpdate();
		if(i>0) {
		System.out.println("data insert successfully");
		}
		else {
			System.out.println("NOO");
		}
		}
        catch(Exception t)
        {
            System.out.println(t);
        }
        
}
}
