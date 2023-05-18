package com.jsp.simple_servlet_project_1pm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.simple_servlet_project_1pm.dto.Employee;
import com.jsp.simple_servlet_project_1pm.service.DisplayService;

public class DisplayController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		DisplayService displayService=new DisplayService();
		List<Employee>employees=displayService.displayDao();
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><head>");
		printWriter.write("<head><link rel='stylesheet' href='employee.css'/></head><body>");
		printWriter.write("<table baoder='1px'>");
		printWriter.write("<tr><th>employeeId</th><th>employeeName</th><th>employeeEmail</th><th>employeePhone</th><th>employeeGender</th></tr>");
		for(Employee employee:employees) {
		printWriter.write("<tr>");
		printWriter.write("<td>"+employee.getEmployeeId()+"</td>");
		printWriter.write("<td>"+employee.getEmployeeName()+"</td>");
		printWriter.write("<td>"+employee.getEmployeeEmail()+"</td>");
		printWriter.write("<td>"+employee.getEmployeePhone()+"</td>");
		printWriter.write("<td>"+employee.getEmployeeGender()+"</td>");
		printWriter.write("</tr>");
		}
		RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		dispatcher.include(req, res);
		printWriter.write("</body></html>");		
	}
}