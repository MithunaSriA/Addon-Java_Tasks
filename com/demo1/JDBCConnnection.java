package com.demo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCConnnection {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String username="root";
		String password="pass1";
		try {
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Success");
		Statement state=con.createStatement();
		ResultSet data = state.executeQuery("select * from emp;");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
