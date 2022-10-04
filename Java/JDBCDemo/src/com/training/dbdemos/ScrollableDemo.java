package com.training.dbdemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ScrollableDemo {

	public static void main(String[] args) {
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
		String sql="select * from employee";
		
		Connection connection = null;
		Statement statement=null;
		
		try {
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, username, password);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs=statement.executeQuery(sql);
			rs.afterLast();
			while(rs.previous()) {
				String name=rs.getString(1);
				int empid=rs.getInt(2);
				String city=rs.getString("city");
				System.out.println(name+"\t"+empid+"\t"+city);
			}
			System.out.println();
			rs.first();
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString("city"));
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
