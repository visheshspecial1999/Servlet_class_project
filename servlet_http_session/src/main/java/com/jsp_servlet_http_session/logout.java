package com.jsp_servlet_http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("logout successfully");
		printWriter.write("</html></body>");
		HttpSession httpSession = req.getSession();
		if ((httpSession.getAttribute("apple") != null)) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("userlogin.jsp");
			requestDispatcher.include(req, resp);
		} else if ((httpSession.getAttribute("orange") != null)) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.include(req, resp);
		} else {

		}
		req.getSession().invalidate();
	}
}
