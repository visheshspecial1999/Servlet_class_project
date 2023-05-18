package com.jsp.servlet_teacher_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.servlet_teacher_crud.dto.Teacher;
import com.jsp.servlet_teacher_crud.service.TeacherService;

public class DisplayController implements Servlet {

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
		TeacherService teacherService=new TeacherService();
		List<Teacher> list=teacherService.displayAll();
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<table border=1px style='color:red'>");
		printWriter.write("<tr><th>teacherId</th><th>teacherName</th><th>teacherEmail</th><th>teacherPhone</th><th>teacherAddress</th></tr>");
		for(Teacher list1:list) {
		printWriter.write("<tr>");
		printWriter.write("<td>"+list1.getTeacherId()+"</td>");
		printWriter.write("<td>"+list1.getTeacherName()+"</td>");
		printWriter.write("<td>"+list1.getTeacherEmail()+"</td>");
		printWriter.write("<td>"+list1.getTeacherPhone()+"</td>");
		printWriter.write("<td>"+list1.getTeacherAddress()+"</td>");
		printWriter.write("</tr>");
		}
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("displayteacher.jsp");
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
