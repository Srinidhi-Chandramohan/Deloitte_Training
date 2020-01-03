package com.deloitte.movie.model;

public class AdminSignup {

	private String userName;
	private String email;
	private String password;
	private double phone;
		
	@Override
	public String toString() {
		return "AdminSignup [userName=" + userName + ", email=" + email + ", password=" + password + ", phone=" + phone
				+ "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	
	
	
}
