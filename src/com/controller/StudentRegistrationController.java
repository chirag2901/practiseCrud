package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.service.StudentService;

/**
 * Servlet implementation class StudentRegistrationController
 */
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		String sPassword = request.getParameter("txtStudentPassword");
		String age = request.getParameter("txtStudentAge");
		int sAge = 0;
		if(age!=null || !age.equals("")) {
			sAge =Integer.parseInt(age);
		}
		StudentBean studentBean = new StudentBean();
		studentBean.setsName(sName);
		studentBean.setsEmail(sEmail);
		studentBean.setsPassword(sPassword);
		studentBean.setsAge(sAge);
		StudentService studentService = new StudentDao();
		if(studentService.addStudent(studentBean)) {
			System.out.println("IN IF OF LISTCONTROLER");
			response.sendRedirect("StudentListController");
		}
		else {
			
			response.sendRedirect("StudentListController");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
