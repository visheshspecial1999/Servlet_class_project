package com.jsp.simple_servlet_project_1pm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.simple_servlet_project_1pm.connection.JdbcConnection;

public class DeleteByIdDao {
	
	// deleteById method
	public int deleteById(int id ) {
		
		// get connection from JdbcConnection class
		Connection connection=JdbcConnection.getConnection();
		String delete="delete from employee where employeeId=?";
		// create statement (prepared statement)
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(delete);
			preparedStatement.setInt(1, id);
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// execute query
			int id1=preparedStatement.executeUpdate();
			if(id1!=0) {
			return id;
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	
}
