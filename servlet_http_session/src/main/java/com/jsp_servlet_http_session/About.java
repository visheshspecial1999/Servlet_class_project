package com.jsp_servlet_http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class About extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		HttpSession httpSession = req.getSession();
		if ((httpSession.getAttribute("apple") != null) || (httpSession.getAttribute("orange") != null)) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("contactus.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			printWriter.write("<html><body>");
			printWriter.write("<h3 style='color:red'>your session is time out please login again</h3>");
			printWriter.write("</html></body>");
			if (httpSession.getAttribute("apple") != null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("userlogin.jsp");
				requestDispatcher.include(req, resp);
			} else if(("orange")!=null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
				requestDispatcher.include(req, resp);
			}
			else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
				requestDispatcher.include(req, resp);
			}
		}
	}
}
