package com.jsp_servlet_http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String userpassword=req.getParameter("userpassword");
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		if((username.equalsIgnoreCase("root"))&&(userpassword.equalsIgnoreCase("123456")))
		{
				HttpSession httpSession=req.getSession();
				httpSession.setAttribute("apple",123);
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(req, resp);
		}
		else {
			printWriter.write("<h3 style='color:red'>invalid credential</h3>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("userlogin.jsp");
			requestDispatcher.include(req, resp);
		}
		printWriter.write("</htm></body>");
	}
}
