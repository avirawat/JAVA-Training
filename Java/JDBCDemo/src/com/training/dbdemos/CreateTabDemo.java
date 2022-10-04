package com.training.dbdemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class CreateTabDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Properties properties=new Properties();
	try {
		properties.load(new FileReader("jdbc.properties"));
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}catch (IOException e1) {
		e1.printStackTrace();
	}

	String url=(String)properties.getProperty("driver");
	String username=(String)properties.get("username");
	String password=(String)properties.get("password");;
	//String sql="insert into student values(?,?,?)";
	//String sql="update student set age=? where studid=110 ";
	//String sql="delete from student where studid=? ";
	String sql="select * from student";
	
	Connection connection=null;
	PreparedStatement ps=null;
	
	
	try {
		connection = DriverManager.getConnection(url, username, password);
		ps=connection.prepareStatement(sql);
		ResultSet rs=ps.executeQuery(sql);
		while(rs.next()) {
			String name=rs.getString(1);
			int studid=rs.getInt(2);
			int age=rs.getInt(3);
			System.out.println(name+"\t"+studid+"\t"+age);
		}
		//System.out.println("Enter Age to update");
		//System.out.println("Enter empid to delete");
		//int empid=sc.nextInt();
		//int age=sc.nextInt();
		//ps.setInt(1,age);
		//s.execute();
//		for(int i=1;i<=2;i++) {
//			String name=sc.next();
//			int empid=sc.nextInt();
//			int age=sc.nextInt();
//			ps.setString(1,name);
//			ps.setInt(2,empid);
//			ps.setInt(3,age);
//			ps.execute();
//			
//		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
