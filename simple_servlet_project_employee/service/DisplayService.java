package com.jsp.simple_servlet_project_1pm.service;

import java.util.List;

import com.jsp.simple_servlet_project_1pm.dao.DisplayDao;
import com.jsp.simple_servlet_project_1pm.dto.Employee;

public class DisplayService {
	DisplayDao dao=new DisplayDao();
	public List<Employee> displayDao() {
		return dao.displayDao();
		
	}
}
