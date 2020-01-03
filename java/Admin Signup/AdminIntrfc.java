package com.deloitte.movie.services;

import java.util.ArrayList;

import com.deloitte.movie.model.AdminSignup;

public interface AdminIntrfc {

	public void signUp(String id, String mailId, String pswd, double ph);
	public boolean logIn(String id,String pswd);
	public ArrayList<AdminSignup> dispAllUsers();
	
	
	
}
