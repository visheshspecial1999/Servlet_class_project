package com.jsp.Customer_Management_v2.service;

import com.jsp.Customer_Management_v2.dao.CustomerDao;
import com.jsp.Customer_Management_v2.dto.Customer;

public class CustomerService {
	
	// getByCustomerId method
		public int getByCustomerId(int customerId) {
			return customerDao.getByCustomerId(customerId);
		}
		
		CustomerDao customerDao = new CustomerDao();
	// addCustomer method
		public void addCustomer(int customerId, String customerName, String customerEmail, long customerPhone) {
			
			customerDao.addCustomer(customerId, customerName, customerEmail, customerPhone);
		
		}
		
		// updateCustomer method
		public void updateCustomer(int customerId, String customerName, String customerEmail, long customerPhone) {
			customerDao.updateCustomer(customerId, customerName, customerEmail, customerPhone);
		}

		// deleteCustomer method
		public void deleteCustomer(int customerId) {
			customerDao.deleteCustomer(customerId);
		}
}
