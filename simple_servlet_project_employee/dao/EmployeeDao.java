package com.jsp.simple_servlet_project_1pm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.simple_servlet_project_1pm.connection.JdbcConnection;
import com.jsp.simple_servlet_project_1pm.dto.Employee;

public class EmployeeDao {

	// insertEmployee Method to add the data
	public Employee insertEmployee(Employee employee) {

		// get connection
		Connection connection = JdbcConnection.getConnection();
		String insert = "insert into employee values(?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getEmployeeName());
			preparedStatement.setString(3, employee.getEmployeeEmail());
			preparedStatement.setLong(4, employee.getEmployeePhone());
			preparedStatement.setString(5, employee.getEmployeeGender());

			preparedStatement.execute();
			return employee;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
