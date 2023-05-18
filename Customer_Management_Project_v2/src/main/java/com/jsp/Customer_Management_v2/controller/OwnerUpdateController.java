package com.jsp.Customer_Management_v2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.Customer_Management_v2.service.AdminService;
@WebServlet(value = "/updateAdmin")
public class OwnerUpdateController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int adminId=Integer.parseInt(req.getParameter("adminId"));
		String adminName=req.getParameter("adminName");
		String adminEmail=req.getParameter("adminEmail");
		AdminService adminService=new AdminService();
		String st=adminService.updateAdmin(adminId, adminName, adminEmail);
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write(st);
		printWriter.write("</body></html>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("updateAdmin.jsp");
		dispatcher.include(req, resp);
		
	}
}
