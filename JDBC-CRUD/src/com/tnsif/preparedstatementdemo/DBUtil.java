//Program to demonstrate Database Settings 
package com.tnsif.preparedstatementdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	
	private static final String DB_DRIVER_CLASS="org.postgresql.Driver";
	private static final String DB_USERNAME="postgres";
	private static final String DB_PASSWORD="Nayna@123";
	private static final String DB_URL ="jdbc:postgresql://localhost:5432/postgres";

	private static Connection con = null;
	private static Properties properties = null;
	static {

		try {
			Class.forName(DB_DRIVER_CLASS);
			properties = new Properties();
			properties.put("user", DB_USERNAME);
			properties.put("password", DB_PASSWORD);
			con = DriverManager.getConnection(DB_URL, properties);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnectionObject() {
		return con;
	}
}
