package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.StudentBean;
import com.mysql.cj.xdevapi.DbDoc;
import com.service.StudentService;
import com.util.DBConnection;

public class StudentDao implements StudentService {
	Connection conn;
	PreparedStatement pstmt;

	public boolean addStudent(StudentBean studentBean) {
		conn = DBConnection.getDBConnection();
		boolean flag = false;
		if (conn != null) {
			String insertSql = "insert into stud(sname,semail,spassword,sage)values(?,?,?,?)";
			try {
				pstmt = conn.prepareStatement(insertSql);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setString(2, studentBean.getsEmail());
				pstmt.setString(3, studentBean.getsPassword());
				pstmt.setInt(4, studentBean.getsAge());
				int res = pstmt.executeUpdate();
				if (res > 0) {
					flag = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return flag;
	}

	public List<StudentBean> getAllstudent() {

		List<StudentBean> students = new ArrayList<StudentBean>();
		conn = DBConnection.getDBConnection();

		if (conn != null) {
			String selectSql = "select * from stud";
			try {
				pstmt = conn.prepareStatement(selectSql);
				ResultSet rs = pstmt.executeQuery(selectSql);
				while (rs.next()) {
					StudentBean studentBean = new StudentBean();
					studentBean.setsId(rs.getInt("sid"));
					studentBean.setsName(rs.getString(2));
					studentBean.setsEmail(rs.getString(3));
					studentBean.setsPassword(rs.getString(4));
					studentBean.setsAge(rs.getInt(5));
					students.add(studentBean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return students;
	}

	public boolean deleteStudent(int sId) {
		boolean flag = false;
		conn = DBConnection.getDBConnection();
		if (conn != null) {
			String deleteSql = "delete from stud where sid = ?";

			try {
				pstmt = conn.prepareStatement(deleteSql);
				pstmt.setInt(1, sId);
				int rs = pstmt.executeUpdate();
				if(rs>0) {
					flag = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	public boolean updateStudent(StudentBean studentBean) {
		boolean flag = false;
		conn = DBConnection.getDBConnection();
		String updateSql = "update stud set sname = ?,semail = ?,spassword = ?,sage = ? where sid = ?";
		if(conn!=null) {
			try {
				pstmt = conn.prepareStatement(updateSql);
				pstmt.setString(1,studentBean.getsName());
				pstmt.setString(2,studentBean.getsEmail());
				pstmt.setString(3,studentBean.getsPassword());
				pstmt.setInt(4,studentBean.getsAge());
				pstmt.setInt(5, studentBean.getsId());
				int res = pstmt.executeUpdate();
				if(res>0) {
					flag = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return flag;
	}

	

	public StudentBean getStudentById(int sId) {
		conn = DBConnection.getDBConnection();
		StudentBean studentBean = null;
		if(conn!=null) {
			String selectSql = "select * from stud where sid = ?";
			try {
				pstmt= conn.prepareStatement(selectSql);
				pstmt.setInt(1, sId);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					studentBean = new StudentBean();
					studentBean.setsId(rs.getInt(1));
					studentBean.setsName(rs.getString(2));
					studentBean.setsEmail(rs.getString(3));
					studentBean.setsPassword(rs.getString(4));
					studentBean.setsAge(rs.getInt(5));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
				
		return studentBean;
	}

}
