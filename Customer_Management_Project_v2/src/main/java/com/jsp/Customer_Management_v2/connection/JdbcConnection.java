package com.jsp.Customer_Management_v2.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static Connection getConnection() {
		
		// load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// create connection
			String url="jdbc:mysql://localhost:3306/Customer_Management_Project_v2";
			String userName="root";
			String password="Vishesh@123";
		Connection connection=DriverManager.getConnection(url, userName, password);
		return connection;
	} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
