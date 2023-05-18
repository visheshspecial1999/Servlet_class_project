package com.jsp.servlet_teacher_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.servlet_teacher_crud.service.TeacherService;

public class DeleteController implements Servlet {

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
		String st=teacherService.deleteById(teacherId);	
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body>");
		printWriter.write(st);
		printWriter.write("</html></body>");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("deleteteacher.jsp");
		requestDispatcher.include(req, res);
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
