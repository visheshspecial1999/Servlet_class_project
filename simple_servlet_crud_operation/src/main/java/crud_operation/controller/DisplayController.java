package crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud_operation.dto.Laptop;
import crud_operation.service.LaptopService;

@SuppressWarnings("serial")
@WebServlet(value="/Display")
public class DisplayController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LaptopService laptopService=new LaptopService();
		List<Laptop>ls=	laptopService.displayLaptop();
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		
			printWriter.write("<table border=1px style='color:green'>");
			printWriter.write("<tr><th>laptopId</th><th>laptopName</th><th>laptopPrice</th></tr>");
			for(Laptop li1:ls) {
			printWriter.write("<tr>");
			printWriter.write("<td>"+li1.getLaptopId()+"</td>");
			printWriter.write("<td>"+li1.getLaptopName()+"</td>");
			printWriter.write("<td>"+li1.getLaptopPrice()+"</td>");
			printWriter.write("</tr>");
			}
			printWriter.write("</table>");
			printWriter.write("</html></body>");
			printWriter.write("");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Laptop_Display.jsp");
			requestDispatcher.include(req, resp);	
	}
}