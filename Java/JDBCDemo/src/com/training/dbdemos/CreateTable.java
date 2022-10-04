package com.training.dbdemos;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/dbtraining";
		String username="root";
		String password = "root";
		String sql="create table employee(name varchar(20),empid Integer,city varchar(20))";

		Connection connection = null;
		Statement statement=null;
		
		try {
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, username, password);
			statement=connection.createStatement();
			boolean val=statement.execute(sql);
			System.out.println("Table created "+val);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
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
