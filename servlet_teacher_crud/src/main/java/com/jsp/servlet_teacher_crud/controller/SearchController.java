package com.jsp.servlet_teacher_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.servlet_teacher_crud.service.TeacherService;

public class SearchController implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int teacherId=Integer.parseInt(req.getParameter("teacherId"));
		TeacherService teacherService=new TeacherService();
		ArrayList ar1=teacherService.searchById(teacherId);
		Iterator i=ar1.iterator();
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body>");
		while(i.hasNext())
		{
			printWriter.write("<h3>"+i.next()+"</h3>");
		}
		printWriter.write("</html></body>");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
