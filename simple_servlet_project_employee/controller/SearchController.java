package com.jsp.simple_servlet_project_1pm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.simple_servlet_project_1pm.dto.Employee;
import com.jsp.simple_servlet_project_1pm.service.SearchService;

public class SearchController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		SearchService searchService = new SearchService();
		List<Employee> employees = searchService.searchService(id);
		PrintWriter printWriter = res.getWriter();
		if (employees != null) {
			printWriter.write("<html><head>");
			printWriter.write("<head><link rel='stylesheet' href='employee.css'/></head><body>");
			printWriter.write("<table baoder='1px'>");
			for (Employee employee : employees) {
				printWriter.write(
						"<tr><th>employeeId</th><th>employeeName</th><th>employeeEmail</th><th>employeePhone</th><th>employeeGender</th></tr>");
				printWriter.write("<tr>");
				printWriter.write("<td>" + employee.getEmployeeId() + "</td>");
				printWriter.write("<td>" + employee.getEmployeeName() + "</td>");
				printWriter.write("<td>" + employee.getEmployeeEmail() + "</td>");
				printWriter.write("<td>" + employee.getEmployeePhone() + "</td>");
				printWriter.write("<td>" + employee.getEmployeeGender() + "</td>");
				printWriter.write("<tr>");
			}
		} else {
			printWriter.write("<h3 style='color:red'>id not found</h3>");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("search.jsp");
		dispatcher.include(req, res);
	}
}
