package com.jsp.servlet_teacher_crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jsp.servlet_teacher_crud.connection.JdbcConnection;

public class SearchDao {

	// searchById method
	public ArrayList searchById(int teacherId) {
		ArrayList ar = new ArrayList();
		// call the getConnection method and store the connection in Connection
		// interface
		Connection connection = JdbcConnection.getconnection();
		String select = "select * from teacher where teacherId=?";
		// create statement(PrepartedStatement)
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(select);

			preparedStatement.setInt(1, teacherId);
			// execute query
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ar.add(resultSet.getInt("teacherId"));
				ar.add(resultSet.getString("teacherName"));
				ar.add(resultSet.getString("teacherEmail"));
				ar.add(resultSet.getLong("teacherPhone"));
				ar.add(resultSet.getString("teacherAddress"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ar;
	}
}