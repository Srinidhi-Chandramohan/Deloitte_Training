package com.deloitte.movie.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.deloitte.movie.model.AdminSignup;
import com.deloitte.movie.services.AdminImpl;

public class AdminSignupDemo {

	public static void main(String[] args) {
		AdminSignup a=new AdminSignup();
		Scanner in=new Scanner(System.in);
		ArrayList<AdminSignup> list=new ArrayList<AdminSignup>();
		AdminImpl im=new AdminImpl();
		
		System.out.println("Welcome to IT Cinemas");
		while(true) {
		System.out.println("Choose an option /n 1.Create an account/n 2.Login /n 3.Dispkay User details/n 4.Exit");
		System.out.println("Your Option:");
		int option=in.nextInt();
		
		switch(option){
		case 1:
		System.out.println("/n***********Sign Up Page***********/n");
		System.out.println("Enter the following details/n");
		System.out.println("Username:");
		String userName=in.next();
		System.out.println("Email:");
		String email=in.next();
		System.out.println("Password:");
		String password=in.next();
		System.out.println("Mobile number:");
		Double phone=in.nextDouble();
		im.signUp(userName,email, password,phone);
		break;
		
		case 2:
			System.out.println("/n***********Login Page***********/n");
			System.out.println("Username:");
			String userId=in.next();
			System.out.println("Password:");
			String pswd=in.next();
			boolean x=im.logIn(userId,pswd);
						if(x)
							System.out.println("Logged in!!!!!");
						else
							System.out.println("Username or password incorrect");
		break;
		
		case 3:
			System.out.println(im.dispAllUsers());
			
		break;
			
		case 4:
			System.exit(0);
		break;
		
		
		}}
	}
	
}
