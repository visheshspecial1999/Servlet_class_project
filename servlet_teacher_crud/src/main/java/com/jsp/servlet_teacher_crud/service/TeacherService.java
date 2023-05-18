package com.jsp.servlet_teacher_crud.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.servlet_teacher_crud.dao.DeleteDao;
import com.jsp.servlet_teacher_crud.dao.DisplayDao;
import com.jsp.servlet_teacher_crud.dao.SearchDao;
import com.jsp.servlet_teacher_crud.dao.TeacherDao;
import com.jsp.servlet_teacher_crud.dao.UpdateDao;
import com.jsp.servlet_teacher_crud.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();

	// insertTeacher method
	public String insertTeacher(Teacher teacher) {
		return teacherDao.insertTeacher(teacher);

	}

	UpdateDao updateDao = new UpdateDao();

	// updateTeacher method
	public String updateTeacher(Teacher teacher) {
		if (updateDao.getById(teacher.getTeacherId()) == teacher.getTeacherId()) {
			return updateDao.updateTeacher(teacher);
		} else {
			return "<h3 style='color:red'>id is not present in database</h3>";
		}
	}

	SearchDao searchDao=new SearchDao();
	//searchById method
		public ArrayList searchById(int teacherId) {
			if(updateDao.getById(teacherId)==teacherId) {
			return searchDao.searchById(teacherId);
			}
			else
			{	ArrayList arrayList=new ArrayList<>();
				arrayList.add("<h4 style='color:red'>"+"id not found in database.please check again"+"</h4>");
				return arrayList;	
			}
		}
		
		DeleteDao deleteDao=new  DeleteDao();
		// deleteById method
		public String deleteById(int teacherId) {
			if(updateDao.getById(teacherId)==teacherId) {
			return deleteDao.deleteById(teacherId);
			}
			else
			{
				return "<h3 style='color:red'>id is not found in database.please check again</h3>";
			}
		}
		
		DisplayDao displayDao=new DisplayDao();
		//displayAll method
		public List<Teacher> displayAll(){
		return	displayDao.displayAll();
		}
}
