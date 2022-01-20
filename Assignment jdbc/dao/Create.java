package com.te.Assignment.dao;

import java.sql.*;
import java.util.Scanner;

import javax.sql.*;

public class Create {
	String dbName = "Student";
	String url = "jdbc:mysql://localhost:3306/" + dbName;
	String username = "root";
	String password = "root";

	Connection connect = null;

	public Create() {
		super();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			try {
				connect = DriverManager.getConnection(url, username, password);

				if (!connect.isClosed()) {
					System.out.println("connection is established");
				} else {
					System.out.println("connection is not estblished");
				}
				Statement state = connect.createStatement();

				String query = "Create table Employer(emp_id int primary key,emp_name varchar(20) ,emp_age int)";

				boolean exicute = state.execute(query);

				System.out.println(exicute);

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			connect = null;
		}

	}

}
