package com.te.Assignment.dao;

import java.sql.*;
import java.util.Scanner;

import javax.sql.*;

public class Read {
	String dbName = "Student";
	String url = "jdbc:mysql://localhost:3306/" + dbName;
	String username = "root";
	String password = "root";


	int emp_age;
	Connection connect = null;

	public Read(int emp_age) {


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
				String query = "Select  * from Employer where emp_age=" + emp_age;
				PreparedStatement preparedStatement = connect.prepareStatement(query);

//				 System.out.println( preparedStatement);

				ResultSet resultset = preparedStatement.executeQuery();
//		 System.out.println(resultset);
//				

				while (resultset.next())
					System.out.println(" Id :" + resultset.getInt("emp_id") + " " + "  Name :"
							+ resultset.getString("emp_name") + " " + "  age : " + resultset.getInt("emp_age"));
//				  //statement.execute();
//				 emp_id=0; 
//				 preparedStatement.setInt(1, emp_id+=1);  

				System.out.println("this is your data");

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
