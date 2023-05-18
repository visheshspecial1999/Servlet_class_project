package com.jsp.servlet_teacher_crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.servlet_teacher_crud.connection.JdbcConnection;
import com.jsp.servlet_teacher_crud.dto.Teacher;

public class DisplayDao {

	//displayAll method
	public List<Teacher> displayAll(){

		List <Teacher>ar=new ArrayList();
		//call the  getConnection method and store the connection in Connection interface
		Connection connection=JdbcConnection.getconnection();
		String select="select * from teacher";
		// create statement(PrepartedStatement)
					PreparedStatement preparedStatement;
					try {
						preparedStatement = connection.prepareStatement(select);
					// execute query
					ResultSet resultSet=preparedStatement.executeQuery();
					while(resultSet.next()) {
						Teacher teacher1=new Teacher();
						teacher1.setTeacherId(resultSet.getInt("teacherId"));
						teacher1.setTeacherName(resultSet.getString("teacherName"));
						teacher1.setTeacherEmail(resultSet.getString("teacherEmail"));
						teacher1.setTeacherPhone(resultSet.getLong("teacherPhone"));
						teacher1.setTeacherAddress(resultSet.getString("teacherAddress"));
						ar.add(teacher1);
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
				return ar;		
	
	
		
	}
}
