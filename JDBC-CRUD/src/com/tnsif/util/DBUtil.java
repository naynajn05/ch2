package com.tnsif.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static Connection cn;
	private static final String DB_DRIVER_CLASS="org.postgresql.Driver";
	private static final String DB_USERNAME="postgres";
	private static final String DB_PASSWORD="Nayna@123";
	private static final String DB_URL ="jdbc:postgresql://localhost:5432/postgres";
	public static Connection establishConnetion() {
		try {
			//Step 1-Load and Register Driver
			Class.forName(DB_DRIVER_CLASS);// to load database driver
			System.out.println("Driver loaded successfully....");

			// Step 2-Establish Connection
			cn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection established successfully....");

		} catch (ClassNotFoundException e) {
			System.out.println("Error....." + e.getMessage());
			// e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error....." + e.getMessage());
		}
		return cn;

	}
}
