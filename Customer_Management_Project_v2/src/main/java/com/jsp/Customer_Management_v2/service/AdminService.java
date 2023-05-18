package com.jsp.Customer_Management_v2.service;

import java.util.Scanner;

import com.jsp.Customer_Management_v2.dao.AdminDao;
import com.jsp.Customer_Management_v2.dao.CustomerDao;
import com.jsp.Customer_Management_v2.dto.Admin;

public class AdminService {
	// insertAdmin method
	public String insertAdmin(Admin admin) {
		AdminDao adminDao = new AdminDao();
		int adminId = admin.getAdminId();
		if (adminDao.getById(adminId) == adminId) {
		return 	"<h3 style='color:red'>this Admin id is already present in database.please chose different Admin id</h3>";
		} else {
			adminDao.insertAdmin(admin);
			return "<h3 style='color:green'>data inserted successfully</h3>";	
		}
	}

	// updateAdmin method
	public String updateAdmin(int adminId, String adminName, String adminEmail) {
		AdminDao adminDao = new AdminDao();
		if (adminDao.getById(adminId) == adminId) {
		return adminDao.updateAdmin(adminId, adminName, adminEmail);
		} else {
			return "<h3 style='color:red'>Admin id not present in database</h3>";
		}
	}

	// deleteAdmin method
	public String deleteAdmin(int adminId) {
		AdminDao adminDao = new AdminDao();
		if (adminDao.getById(adminId) == adminId) {
			return adminDao.deleteAdmin(adminId);
		} else {
			return "<h3 style='color:red'>Admin id is not present in database or already deleted</h3>";
		}
	}

	// loginAdmin method
	public void loginAdmin(String adminName, String adminEmail) {
		AdminDao adminDao = new AdminDao();
		if (adminDao.adminName(adminName) == adminDao.adminEmail(adminEmail)) {
			System.out.println("welcome to Admin Dashboard");
			while (true) {
				System.out.println("1.Addcustomer\n2.Deletecustomer\n3.Updatecustomer\n4.Logout");
				System.out.println("Enter your choice: ");
				Scanner s = new Scanner(System.in);
				int choice = s.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("Enter customerId: ");
					int customerId = s.nextInt();
					System.out.println("Enter customerName: ");
					String customerName = s.next();
					customerName += s.nextLine();

					System.out.println("Enter customerEmail: ");
					String customerEmail = s.nextLine();

					System.out.println("Enter customerPhone: ");
					long customerPhone = s.nextLong();

					CustomerDao customerDao = new CustomerDao();
					customerDao.addCustomer(customerId, customerName, customerEmail, customerPhone);
				}
					break;
				case 2: {
					CustomerDao customerDao = new CustomerDao();
					System.out.println("Enter customerId: ");
					int customerId = s.nextInt();
					customerDao.deleteCustomer(customerId);
				}
					break;
				case 3: {

					System.out.println("Enter customerId: ");
					int customerId = s.nextInt();
					System.out.println("Enter customerName: ");
					String customerName = s.next();
					customerName += s.nextLine();

					System.out.println("Enter customerEmail: ");
					String customerEmail = s.nextLine();

					System.out.println("Enter customerPhone: ");
					long customerPhone = s.nextLong();

					CustomerDao customerDao = new CustomerDao();
					customerDao.updateCustomer(customerId, customerName, customerEmail, customerPhone);
				}
					break;
				case 4: {
					System.out.println("Logout successfully!!!");
					System.exit(choice);
				}
					break;
				default: {
					System.out.println("invalid choice!!!");
				}

				}
			}
		} else {
			System.out.println("invalid credintial please try again!!!");
		}
	}
}
