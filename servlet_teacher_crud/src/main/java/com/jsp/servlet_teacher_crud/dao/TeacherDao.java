package com.jsp.servlet_teacher_crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.servlet_teacher_crud.connection.JdbcConnection;
import com.jsp.servlet_teacher_crud.dto.Teacher;

public class TeacherDao {
	// insertTeacher method
	public String insertTeacher(Teacher teacher) {
		
		//call the  getConnection method and store the connection in Connection interface
		Connection connection=JdbcConnection.getconnection();
		
		String insert="insert into teacher values(?,?,?,?,?)";
		// create statement(PrepartedStatement)
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(insert);
		
		preparedStatement.setInt(1, teacher.getTeacherId());
		preparedStatement.setString(2, teacher.getTeacherName());
		preparedStatement.setString(3, teacher.getTeacherEmail());
		preparedStatement.setLong(4, teacher.getTeacherPhone());
		preparedStatement.setString(5, teacher.getTeacherAddress());
		
		// execute query
	boolean b=preparedStatement.execute();
	if(b==false) {
		return "<h3 style='color:green'>data...............inserted</h3>";
	}
	else
	{
		return "<h3 style='color:red'>error</h3>";
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
	return null;
	}
}
