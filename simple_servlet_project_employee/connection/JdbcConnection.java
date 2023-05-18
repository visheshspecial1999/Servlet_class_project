package com.jsp.simple_servlet_project_1pm.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	// create connection
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/basic~jdbc";
		String userName = "root";
		String password = "Vishesh@123";
		
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			return connection;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
