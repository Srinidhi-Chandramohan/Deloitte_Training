package com.deloitte.movie.services;

import java.util.ArrayList;

import com.deloitte.movie.DAO.AdminDAO;
import com.deloitte.movie.model.AdminSignup;

public class AdminImpl implements AdminIntrfc {
	ArrayList<AdminSignup> list=new ArrayList<AdminSignup>();

	@Override
	public void signUp(String id, String mailId, String pswd, double ph) {
		// TODO Auto-generated method stub
		AdminSignup a=new AdminSignup();
		a.setUserName(id);
		a.setEmail(mailId);
		a.setPassword(pswd);
		a.setPhone(ph);
		AdminDAO.signUp(a);	
	
	}

	@Override
	public boolean logIn(String id,String pswd) {
		// TODO Auto-generated method stub
		boolean login=AdminDAO.login(id,pswd);
		if(login)
			return true;
		else
			return false;
		
	}
		
		/*
		  
		 * for(AdminSignup up:login)
		 
		{		if(up.getUserName()==id) {			
				if(up.getPassword()==pswd)
				System.out.println("Logged In!!!!");
				else
					System.out.println("Password is incorrect");
		}
			else
				System.out.println("Username is incorrect");
		        continue;   */
				
	 
		

	@Override
	public ArrayList<AdminSignup> dispAllUsers() {
		// TODO Auto-generated method stub
		
		return AdminDAO.dispAllUsers();
	}

	
	
	
}

