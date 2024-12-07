package com.carrentalsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Database {

	
	private String user = "user";
	private String password  = "Planet@1122334455";
	private String url = "jdbc:mysql://localhost/carrentalsystem";
	private Statement statement; // Statement object is used to execute static sql queries.
	private Connection connection; 
	
	
	public Database() {
		try {
			Connection connection; // Connection object estabilishes a connection with a database.
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Statement getStatement() {
		return statement;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
}
