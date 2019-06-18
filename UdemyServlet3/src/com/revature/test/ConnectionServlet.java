package com.revature.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConnectionServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//define the table
		String username = "nick_rocksvold";
		String password = "oracle";
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			//get printwriter object
			PrintWriter writer = response.getWriter();
			writer.println("connecting to database" + jdbcURL);
			//load driver
			Class.forName(driver);
			//get connection
			Connection connection = DriverManager.getConnection(jdbcURL,username,password);
			writer.println("Connection successful");
			//close connection
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
