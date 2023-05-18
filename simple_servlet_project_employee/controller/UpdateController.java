package com.jsp.simple_servlet_project_1pm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.simple_servlet_project_1pm.service.UpdateService;

public class UpdateController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		UpdateService service =new UpdateService();
		int id=Integer.parseInt(req.getParameter("id"));
		String username=req.getParameter("name");
		String useremail=req.getParameter("email");
		long userphone=Long.parseLong(req.getParameter("phone"));
		String usergender=req.getParameter("gender");
		String st=service.updateDao(id, username, useremail, userphone, usergender);
//		System.out.println(st);
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body>");
		printWriter.write(st);
		RequestDispatcher dispatcher=req.getRequestDispatcher("update.jsp");
		dispatcher.include(req, res);
		printWriter.write("</html></body>");	
	}

	
}
