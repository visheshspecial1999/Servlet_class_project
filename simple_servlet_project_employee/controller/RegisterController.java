package com.jsp.simple_servlet_project_1pm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.simple_servlet_project_1pm.dto.Employee;
import com.jsp.simple_servlet_project_1pm.service.EmployeeService;

public class RegisterController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		 long phone=Long.parseLong(req.getParameter("phone")); 
		String gender = req.getParameter("gender");
		System.out.println();
//		 System.out.println(id+"\n"+name+"\n"+email+"\n"+phone+"\n"+gender);  
		 EmployeeService employeeService=new EmployeeService();
		 Employee employee=new Employee();
		 employee.setEmployeeId(id);
		 employee.setEmployeeName(name);
		 employee.setEmployeeEmail(email);
		 employee.setEmployeePhone(phone);
		 employee.setEmployeeGender(gender);
		 Employee employee2 =employeeService.insertEmployee(employee);
		 PrintWriter printWriter =res.getWriter();
		 printWriter.write("<html><body>");
		 if(employee2!=null) {
			 printWriter.write("<h3 style='color:green'>Successfully........Stored</h3>");
			 printWriter.write("<html><body><h3>Id:"+id+"</h3></body></html>");
			 printWriter.write("<html><body><h3>Name:"+name+"</h3></body></html>");
			  printWriter.write("<html><body><h3>Email:"+email+"</h3></body></html>");
			  printWriter.write("<html><body><h3>Phone:"+phone+"</h3></body></html>");
			  printWriter.write("<html><body><h3>Gender:"+gender+"</h3></body></html>");
			 RequestDispatcher dispatcher=req.getRequestDispatcher("registration_form.jsp");
			 dispatcher.include(req, res); 
		 }else {
			 printWriter.write("<h3 style='color:red'>Please check your data</h3>");
			 RequestDispatcher dispatcher=req.getRequestDispatcher("registration_form.jsp");
			 dispatcher.include(req, res);
		 }
		 printWriter.write("</body></html>");	 
	}
}