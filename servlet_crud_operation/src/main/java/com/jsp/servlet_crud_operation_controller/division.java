package com.jsp.servlet_crud_operation_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class division implements Servlet {

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
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<h3 style='color:green'>"+"Division: "+(a/b)+"</h3>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("division.jsp");
		dispatcher.include(req, res);
		printWriter.write("</body></html>");
		
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
