package com.jsp.servlet_teacher_crud.dto;

public class Teacher {
	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	private long teacherPhone;
	private String teacherAddress;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public long getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(long teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
}
