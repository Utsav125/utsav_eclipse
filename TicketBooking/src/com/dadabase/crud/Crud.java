package com.dadabase.crud;
//It will run on pakage com.dadabase.main and main class
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.database.jdbc.Delete;
import com.database.jdbc.Featch;
import com.database.jdbc.Insert;
import com.database.jdbc.Update;

public class Crud implements Delete,Featch,Update,Insert{
	final static String driver="com.mysql.jdbc.Driver";
	final static String dbconn="jdbc:mysql://localhost:3306/svce";
	final static String user="root";
	final static String pass="4093";
	static String delete="delete from dadi1 where id=7";
	static String updates="update dadi1 set name='UMESH' where id=14";
	static String insert="insert into dadi2(id,name,city,Country) values(?,?,?,?);";
	static String select="Select id,name,city,country from dadi1";
	Connection con=null;
	Statement stm;
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(driver);
		
		con=DriverManager.getConnection(dbconn,user,pass);
		return con;
	}

	@Override
	public void add() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		con=DriverManager.getConnection(dbconn,user,pass);
		stm=con.createStatement();
		PreparedStatement pr=con.prepareStatement(insert);
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the ID: ");
		int id=s1.nextInt();
	      s1.nextLine();
		System.out.println("enter the Name");
		String name=s1.nextLine();
		System.out.println("enter the City");
		String city=s1.nextLine();
		System.out.println("enter the country");
		String country=s1.nextLine();
		pr.setInt(1, id);
		pr.setString(2,name);
		pr.setString(3, city);
		pr.setString(4, country);
		int i=pr.executeUpdate();
		if(i>0) {
		System.out.println("data insert successfully");
		}
		else {
			System.out.println("NOO");
		}
	}

	@Override
	public void update() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		con=DriverManager.getConnection(dbconn,user,pass);
		stm=con.createStatement();
		stm.executeUpdate(updates);	
		System.out.println("Data Updated:");
	}

	@Override
	public void display() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName(driver);
		con=DriverManager.getConnection(dbconn,user,pass);
		stm=con.createStatement();
		ResultSet rSet=stm.executeQuery(select);
		while(rSet.next())
		{
			System.out.println(rSet.getInt(1)+" "+rSet.getString(2));
		}

	}

	@Override
	public void delete() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		con=DriverManager.getConnection(dbconn,user,pass);
		stm=con.createStatement();
		stm.executeUpdate(delete);
		System.out.println("Data Deleted:");
	}


}
