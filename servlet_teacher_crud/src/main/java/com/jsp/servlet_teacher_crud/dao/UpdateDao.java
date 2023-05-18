package com.jsp.servlet_teacher_crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.servlet_teacher_crud.connection.JdbcConnection;
import com.jsp.servlet_teacher_crud.dto.Teacher;

public class UpdateDao {
	// getById method 
	public int getById(int teacherId) {
		//call the  getConnection method and store the connection in Connection interface
		Connection connection=JdbcConnection.getconnection();
		String select="select teacherId from teacher where teacherId=?";
		// create statement(PrepartedStatement)
					PreparedStatement preparedStatement;
					try {
						preparedStatement = connection.prepareStatement(select);
					
					preparedStatement.setInt(1, teacherId);
					// execute query
					ResultSet resultSet=preparedStatement.executeQuery();
					while(resultSet.next()) {
					return resultSet.getInt("teacherId");
					} 
					}
				catch (SQLException e) 
					{
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
				return 0;		
	}
	
	// updateTeacher method
	public String updateTeacher(Teacher teacher) {
			//call the  getConnection method and store the connection in Connection interface
			Connection connection=JdbcConnection.getconnection();
			
			String update="update  teacher set teacherName=?,teacherEmail=?,teacherPhone=?,teacherAddress=? where teacherId=?";
			// create statement(PrepartedStatement)
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement(update);
			
			preparedStatement.setInt(5, teacher.getTeacherId());
			preparedStatement.setString(1, teacher.getTeacherName());
			preparedStatement.setString(2, teacher.getTeacherEmail());
			preparedStatement.setLong(3, teacher.getTeacherPhone());
			preparedStatement.setString(4, teacher.getTeacherAddress());
			
			// execute query
		int b=preparedStatement.executeUpdate();
		if(b==1) {
			return "<h3 style='color:green'>data...............updated</h3>";
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
