package com.jsp.simple_servlet_project_1pm.service;

import com.jsp.simple_servlet_project_1pm.dao.DeleteByIdDao;

public class DeleteService {
	 DeleteByIdDao deleteByIdDao=new  DeleteByIdDao();
	 public int  DeleteById(int id)
	 {
		return deleteByIdDao.deleteById(id);		
	 }
}
