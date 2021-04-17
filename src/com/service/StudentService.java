package com.service;

import java.util.List;

import com.bean.StudentBean;

public interface StudentService {
	public boolean addStudent(StudentBean studentBean);
	public List<StudentBean> getAllstudent();
	public boolean deleteStudent(int sId);
	public boolean updateStudent(StudentBean studentBean);
	public StudentBean getStudentById(int sId);
}
