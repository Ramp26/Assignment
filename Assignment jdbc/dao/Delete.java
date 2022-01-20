package com.te.Assignment.dao;

import java.sql.*;
import javax.sql.*;

public class Delete {

	Connection connection = null;

	String dbName = "Student";
	String url = "jdbc:mysql://localhost:3306/" + dbName;
	String userName = "root";
	String password = "root";

	int emp_id;

	public Delete(int emp_id) {

		this.emp_id = emp_id;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			try {
				connection = DriverManager.getConnection(url, userName, password);

				if (!connection.isClosed()) {
					System.out.println("connection is established");
				} else {
					System.out.println("connection is not establised");
				}

				String Query = "delete from Employer where emp_id=" + emp_id;
				PreparedStatement preparedStatement = connection.prepareStatement(Query);
				int resultset = preparedStatement.executeUpdate();
				System.out.println("you successfully Deleted the data where employee Id :" + emp_id);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection = null;
		}

	}

}
