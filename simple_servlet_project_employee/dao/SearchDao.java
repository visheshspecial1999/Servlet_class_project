package com.jsp.simple_servlet_project_1pm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.simple_servlet_project_1pm.connection.JdbcConnection;
import com.jsp.simple_servlet_project_1pm.dto.Employee;

public class SearchDao {
// searchDao method
	public List<Employee> searchDao(int id) {
		List<Employee> employees=new ArrayList<Employee>();
		// call JdbcConnection method to return the connection
		Connection connection = JdbcConnection.getConnection();
		String select = "select * from employee where employeeId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			Class.forName("com.mysql.cj.jdbc.Driver");
			// execute query
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Employee employee=new Employee();
				employee.setEmployeeId(resultSet.getInt("employeeId"));
				employee.setEmployeeName(resultSet.getString("employeeName"));
				employee.setEmployeeEmail(resultSet.getString("employeeEmail"));
				employee.setEmployeePhone(resultSet.getInt("employeePhone"));
				employee.setEmployeeGender(resultSet.getString("employeeGender"));
				employees.add(employee);
				return employees;
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
