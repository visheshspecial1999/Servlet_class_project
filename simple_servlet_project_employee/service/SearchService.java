package com.jsp.simple_servlet_project_1pm.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.simple_servlet_project_1pm.dao.SearchDao;
import com.jsp.simple_servlet_project_1pm.dto.Employee;

public class SearchService {
	// searchService method
	public List<Employee> searchService(int id) {
		
		SearchDao dao=new SearchDao();
		return dao.searchDao(id);
	}
}
