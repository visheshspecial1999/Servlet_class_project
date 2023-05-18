package com.jsp.Customer_Management_v2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OwnerLogoutController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession=req.getSession();
		if(httpSession.getAttribute("apple")!=null)
		{PrintWriter printWriter=resp.getWriter();
		printWriter.write("<h3 style='color:red'>Logout successfully</h3>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("ownerLogin.jsp");
		dispatcher.include(req, resp);
		}
		else {
			
		}
		req.getSession().invalidate();
	}
}