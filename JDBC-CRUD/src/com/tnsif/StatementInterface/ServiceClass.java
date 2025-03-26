package com.tnsif.StatementInterface;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tnsif.util.DBUtil;

public class ServiceClass {
	
	static Connection cn;
	static Statement st;
	static
	{
	
		 cn=DBUtil.establishConnetion();
		 
		//step -3 Create statement
		  try {
			st=cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	//Insert the employee data
	public static int addEmp(int id, String name, int salary) {

		int n = 0;
		try {

			String query = "INSERT INTO emp VALUES(" + id + ",'" + name + "'," + salary + ")";
			n = st.executeUpdate(query);
			System.out.println("One Employee added");
		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
			n = 0;
		}
		return n;

	}

	//Validate
	public static int validateEmp(int id) {
		int n = 0;
		try {
			String query = "SELECT count(*) FROM emp where id=" + id;
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return n;
		
	}

	//Delete
	public static boolean deleteEmp(int id) {
		boolean status = false;

		try {

			int n = validateEmp(id);
			if (n == 1) {
				String query = "DELETE FROM emp WHERE id=" + id;
				st.executeUpdate(query);
				status = true;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//Update Name
	public static boolean updateName(int id, String name) {
		boolean status = false;
		try {

			if (validateEmp(id) == 1) {
				String query = "UPDATE emp set name= '" + name + "' WHERE id=" + id;
				st.executeUpdate(query);
				status = true;
				System.out.println("Name is updated");
			} else

				System.out.println("No such Employee Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//Update salary
	public static boolean updateSalary(int id, int salary) {
		boolean status = false;
		try {

			if (validateEmp(id) == 1) {
				String query = "UPDATE emp SET salary=" + salary + " WHERE id=" + id;
				st.executeUpdate(query);
				status = true;
				System.out.println("Salary is updated");
			} else
				System.out.println("No such Employee Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//Retrieve data
	public static void showEmp() {
		try {

			String query = "SELECT * FROM employee";
			ResultSet rs = st.executeQuery(query);


			if (rs.next()) {
				while (rs.next()) {

					System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getInt("salary"));
				}
			} else
				System.out.println("No Employee Records.....");
			rs.close();

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
	}
		//Step -7 close connection
	public void closeConnection() {
		try {
			st.close();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
