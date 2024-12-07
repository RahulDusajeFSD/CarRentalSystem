package com.carrentalsystem.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.carrentalsystem.model.Database;
import com.carrentalsystem.model.Operation;
import com.carrentalsystem.model.User;

public class AddNewAdmin implements Operation {

	public AddNewAdmin() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation(Database database, Scanner s, User user) {

		System.out.println("Enter First Name");
		String firstName = s.next();
		System.out.println("Enter Last Name");
		String lastName = s.next();
		System.out.println("Enter Email");
		String email = s.next();
		System.out.println("Enter phoneNumber");
		String phoneNumber = s.next();
		System.out.println("Enter password");
		String password = s.next();
		System.out.println("Confirm Enter password");
		String confirmPassword = s.next();
		while (!confirmPassword.equals(password)) {
			System.out.println("Password Doesn't match");
			System.out.println("Enter password");
			password = s.next();
			System.out.println("Confirm Enter password");
			confirmPassword = s.next();
		}

		int accType = 1;

		
		
		try {
			

			String insertAdminSqlQuery = "Insert into users values(?,?,?,?,?,?Í)";
							
			PreparedStatement preparedStatement  = database.getConnection().prepareStatement(insertAdminSqlQuery);
			
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, phoneNumber);
			preparedStatement.setString(5, password);
			preparedStatement.setInt(6, accType);
			
			
			
			preparedStatement.executeBatch();
			database.getConnection().commit();
			
			System.out.println("Admin Account Created Successfully");
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
