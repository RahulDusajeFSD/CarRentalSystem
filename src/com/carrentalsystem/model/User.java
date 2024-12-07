package com.carrentalsystem.model;

import java.util.Scanner;


public abstract class User {
	
	private int Id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	
	// Type - 0 for Client, 
	//      - 1 for Admin
	//      - 2 for DeletedClientAccount
	//      - 3 for DeletedAdminAccount
	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id=  Id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		
	}
	
	
	public abstract void showList(Database database, Scanner s);

}
