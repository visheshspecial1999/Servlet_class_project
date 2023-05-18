package com.jsp.Customer_Management_v2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Customer_Management_v2.service.AdminService;
@WebServlet(value = "/deleteAdmin")
public class OwnerDeleteController  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int adminId=Integer.parseInt(req.getParameter("adminId"));
		AdminService adminService=new AdminService();
		String st=adminService.deleteAdmin(adminId);
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write(st);
		printWriter.write("</body></html>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("deleteAdmin.jsp");
		dispatcher.include(req, resp);	
	}
}
