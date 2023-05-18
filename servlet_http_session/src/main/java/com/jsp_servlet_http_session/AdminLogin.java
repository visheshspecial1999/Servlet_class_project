package com.jsp_servlet_http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("adminname");
		String userpassword = req.getParameter("adminpassword");
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body>");
		if ((username.equalsIgnoreCase("mysql")) && (userpassword.equalsIgnoreCase("mysql123"))) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("orange", 456);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			printWriter.write("<h3 style='color:red'>invalid credential</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("userlogin.jsp");
			requestDispatcher.include(req, resp);
		}
		printWriter.write("</htm></body>");
	}
}
