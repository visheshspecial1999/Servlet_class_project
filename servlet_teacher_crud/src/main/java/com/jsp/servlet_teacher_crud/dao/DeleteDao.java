package com.jsp.servlet_teacher_crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.servlet_teacher_crud.connection.JdbcConnection;

public class DeleteDao {

	// deleteById method
	public String deleteById(int teacherId) {
		//call the  getConnection method and store the connection in Connection interface
		Connection connection=JdbcConnection.getconnection();
		String delete="delete  from teacher where teacherId=?";
		// create statement(PrepartedStatement)
					PreparedStatement preparedStatement;
					try {
						preparedStatement = connection.prepareStatement(delete);
					
					preparedStatement.setInt(1, teacherId);
					// execute query
				int b =preparedStatement.executeUpdate();
				if(b==1) {
					return "<h4 style='color:green'>data...............deleted</h4>";
				}
				else
				{
					return "<h4 style='color:red'>error</h4>";
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
				return null;		
	}
}
