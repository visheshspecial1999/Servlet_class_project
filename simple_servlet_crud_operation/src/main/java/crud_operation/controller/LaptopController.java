package crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud_operation.dto.Laptop;
import crud_operation.service.LaptopService;

@SuppressWarnings("serial")
@WebServlet(value="/Insert")
public class LaptopController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int laptopId=Integer.parseInt(req.getParameter("laptopId"));
		String laptopName=req.getParameter("laptopName");
		double laptopPrice=Double.parseDouble(req.getParameter("laptopPrice"));
		Laptop laptop=new Laptop();
		laptop.setLaptopId(laptopId);
		laptop.setLaptopName(laptopName);
		laptop.setLaptopPrice(laptopPrice);
		LaptopService laptopService=new LaptopService();
		String st=laptopService.insertLaptop(laptop);
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write(st);
		printWriter.write("</html></body>");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("Laptop_Insert.jsp");
		requestDispatcher.include(req, resp);
		
	}
}