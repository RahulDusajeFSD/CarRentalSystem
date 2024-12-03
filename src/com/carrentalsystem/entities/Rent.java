package com.carrentalsystem.entities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rent {

	private int Id;
	private User user;
	private Car car;
	private LocalDateTime dateTime;
	private int hours;
	private double total;
	private String status;
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
	
	public Rent() {
		dateTime = LocalDateTime.now();
		
	}
	
	public String getDateTime() {
		return formatter.format(dateTime);
	}
	
	public void setDateTime(String dateTime) {
		this.dateTime = LocalDateTime.parse(dateTime, formatter);
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
