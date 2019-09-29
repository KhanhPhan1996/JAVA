package vn.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector_utils {
	public static Connection getMyConnection() throws SQLException, ClassNotFoundException{
		String hostName = "localhost";
		String dbName = "demo";
		String userName = "root";
		String password = "1996";
		
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL,userName,password);
		return conn;
		
	}
	
	public static void main(String[] args) {
		try {
			Connection acb = getMyConnection();	
			System.out.println(acb);
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
