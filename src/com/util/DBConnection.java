package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
//	private static String userName = "root123";
//	private static String password = "root";
//	private static String connectionURL = "jdbc:mysql://localhost:3306 /world";
//	private static String driverClass = "com.mysql.jdbc.Driver";
	private static String userName = "uxkxestdnrsjct";
	private static String password = "e2d3889dc3e84ac2b350ef070658577cff76e047011cfe6cd23da12f2a7aad9f";
	private static String connectionURL = "jdbc:postgresql://ec2-34-225-167-77.compute-1.amazonaws.com:5432/d9rt9p63ql2u9m?sslmode=require";
	private static String driverClass = "org.postgresql.Driver";
	
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(connectionURL, userName, password);
			if(conn!=null) {
				System.out.println("Connected to DbConnection Practise");
			}
			else {

				System.out.println("Connected to DbConnection Practise");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void main(String[] args) {
		DBConnection.getDBConnection();
	}
}	
