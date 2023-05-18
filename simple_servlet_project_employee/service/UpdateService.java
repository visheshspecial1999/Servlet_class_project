package com.jsp.simple_servlet_project_1pm.service;

import com.jsp.simple_servlet_project_1pm.dao.UpdateDao;

public class UpdateService {
	public String updateDao(int id,String username,String useremail,long userphone,String usergender) {
		UpdateDao dao=new UpdateDao();
		return dao.updateDao(id, username, useremail, userphone, usergender);
		
	}
	
}
