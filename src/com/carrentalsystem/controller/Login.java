package com.carrentalsystem.controller;

import com.carrentalsystem.model.Admin;
import com.carrentalsystem.model.Client;
import com.carrentalsystem.model.Database;
import com.carrentalsystem.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	public Login(Database database, Scanner s) {
		
		System.out.println("Enter your Email");
		String email = s.next();
		
		

		System.out.println("Enter your Password");
		String password = s.next();
		
		ArrayList<User> users = new ArrayList<>();
		
		
		try {
			
		String selectQuery = "Select * from users";
		
		ResultSet rs = database.getStatement().executeQuery(selectQuery);
		
		while(rs.next()) {
			
			User user;
			int Id = rs.getInt("Id");
			String firstName = rs.getString("firstName");
			String lastName = rs.getString("lastName");
			String em = rs.getString("email");
			String phoneNumber = rs.getString("phoneNumber");
			int type = rs.getInt("type");
			String pass = rs.getString("password");
			
			
			switch(type){
			
			case 0: 
				user = new Client();
				break;
			case 1:
				user = new Admin();
				break;
			default:
				user = new Client();
				break;
			
			}
			
			user.setId(Id);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmail(em);
			user.setPhoneNumber(phoneNumber);
			user.setPassword(password);
			
			users.add(user);
			
			
			
		}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		for(User user : users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Welcome!" + user.getFirstName() + "!");
				user.showList(database, s);
			}
		}
		
	}

}
