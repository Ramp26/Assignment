package com.te.Assignment.dao;

import java.sql.*;

import java.util.Scanner;

import javax.sql.*;

public class Insert {
	String dbName = "Student";
	String url = "jdbc:mysql://localhost:3306/" + dbName;
	String username = "root";
	String password = "root";

	int emp_id;
	String emp_name;
	int emp_age;
	Connection connect = null;

	public Insert(int emp_id, String emp_name, int emp_age) {

//	int count=0;
//	count+=1;

		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			try {
				connect = DriverManager.getConnection(url, username, password);

				if (!connect.isClosed()) {
					System.out.println("connection is established");
				} else {
					System.out.println("connection is not estblished");
				}
//				 Statement state= connect.createStatement();

				String query = "insert into  Employer values(?,?,?)";
				PreparedStatement preparedStatement = connect.prepareStatement(query);

				preparedStatement.setInt(1, emp_id);
				preparedStatement.setString(2, emp_name);
				preparedStatement.setInt(3, emp_age);
//				 emp_id=0; 
//				 preparedStatement.setInt(1, emp_id+=1);  

				boolean execute = preparedStatement.execute();

//				 		System.out.println(execute);

				System.out.println("Inserted");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			connect = null;
		}

	}

	// TODO Auto-generated constructor stub

}
