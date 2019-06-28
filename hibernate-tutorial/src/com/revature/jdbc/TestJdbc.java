package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:oracle:thin:@rocksvolddb.cfc8lkssez5m.us-east-2.rds.amazonaws.com:1521:ORCL";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to database" + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection successful");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
