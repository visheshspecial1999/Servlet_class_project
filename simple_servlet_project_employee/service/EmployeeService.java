package com.jsp.simple_servlet_project_1pm.service;

import com.jsp.simple_servlet_project_1pm.dao.EmployeeDao;
import com.jsp.simple_servlet_project_1pm.dto.Employee;

public class EmployeeService {
	
	EmployeeDao employeeDao=new EmployeeDao() ;
		
	public Employee insertEmployee(Employee employee) {
		
		 return employeeDao.insertEmployee(employee);
	}

}
