package com.jsp.simple_servlet_project_1pm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.simple_servlet_project_1pm.service.DeleteService;

public class DeleteController extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method
		int id=Integer.parseInt(req.getParameter("id"));
		DeleteService deleteService=new DeleteService();
		int id1= deleteService.DeleteById(id);
			PrintWriter printWriter=res.getWriter();
			printWriter.write("<html><body>");
			if(id1!=0) {
			printWriter.write("<h3 style='color:green'>deleted............successfully</h3>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("delete.jsp");
			dispatcher.include(req, res);
		}
		else {
			printWriter.write("<h3 style='color:red'>id is not present in data base.please check your id and try again</h3>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("delete.jsp");
			dispatcher.include(req, res);
			printWriter.write("</html></body>");
		}
	}
	

}
