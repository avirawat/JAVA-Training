package com.training.dbdemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Update {

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
		String sql="update employee set city='Fd' where empid=151";
		
		Connection connection = null;
		Statement statement=null;
		
		try {
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, username, password);
			statement=connection.createStatement();
			boolean val=statement.execute(sql);
			System.out.println("updated "+val);
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
