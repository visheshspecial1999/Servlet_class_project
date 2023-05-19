package com.jsp.Customer_Management_v2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Customer_Management_v2.service.OwnerService;

@WebServlet(value = "/ownerDisplay")
public class OwnerDisplayController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OwnerService ownerService=new OwnerService();
		ownerService.displayOwners();
	}
}
