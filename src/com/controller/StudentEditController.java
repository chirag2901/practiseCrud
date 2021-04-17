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
 * Servlet implementation class StudentEditController
 */
public class StudentEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String studId = request.getParameter("sid");
		int sId = 0;
		
		if(!studId.equals(null) && !studId.equals("")) {
			sId = Integer.parseInt(studId);
		}
		StudentService studentService = new StudentDao();
		StudentBean studentBean = studentService.getStudentById(sId);
		if(!studentBean.equals(null)) {
		request.setAttribute("studentBean", studentBean);
		request.getRequestDispatcher("studentEdit.jsp").forward(request, response);
		}
		else {
				response.sendRedirect("error.jsp");
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
