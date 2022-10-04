package com.training.dbdemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class InsertTable {

	public static void main(String[] args){
		
		Properties properties=new Properties();
		try {
			properties.load(new FileReader("jdbc.properties"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch(IOException e1) {
			e1.printStackTrace();
		}
		String url=(String)properties.get("driver");;
		String username=(String)properties.get("username");
		String password=(String)properties.get("password");;
		//String sql="insert into employee values('Ram',10,'Bangalore')";
		
		Connection connection = null;
		Statement statement=null;
		
		try {
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, username, password);
			statement=connection.createStatement();
//			boolean val=statement.execute(sql);
//			System.out.println("Inserted "+val);
			
			System.out.println("Enter Details");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<2;i++) {
				String name=sc.next();
				int id=sc.nextInt();
				String city=sc.next();
				
			String query="insert into employee values('"+name+"',"+id+",'"+city+"')";
			statement.execute(query);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement!=null)
					statement.close();
				if(connection!=null)
					connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
