package com.jsp.Customer_Management_v2.controller;

import java.util.Scanner;

import com.jsp.Customer_Management_v2.service.ProductService;

public class ProductController {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("welcome to customer Login");
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter customerId: ");
			int customerId = s.nextInt();
			System.out.print("Enter your password: ");
			long customerPhone = s.nextLong();
			ProductService productService = new ProductService();
			productService.customerLogin(customerId, customerPhone);
		}
	}
}