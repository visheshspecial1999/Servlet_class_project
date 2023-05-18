package com.jsp.simple_servlet_project_1pm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.simple_servlet_project_1pm.connection.JdbcConnection;

public class UpdateDao {
//updateDao method
	public String updateDao(int id,String username,String useremail,long userphone,String usergender) {
		// call connection
	Connection	connection=JdbcConnection.getConnection();
	String update="update employee set employeeName=?,employeeEmail=?,employeePhone=?,employeeGender=? where employeeId=?";
	PreparedStatement preparedStatement;
	try {
		preparedStatement = connection.prepareStatement(update);
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	preparedStatement.setString(1, username);
	preparedStatement.setString(2, useremail);
	preparedStatement.setLong(3, userphone);
	preparedStatement.setString(4, usergender);
	preparedStatement.setInt(5, id);
	
	int id1=preparedStatement.executeUpdate();
	if(id1!=0) {
		return "<h3 style='color:green'>updated................successfully</h3>";
	}
	
	else
	{
		return "<h3 style='color:red'>id is not present in database.please chech your id and try again.</h3>";
	}
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return null;
	}
}
