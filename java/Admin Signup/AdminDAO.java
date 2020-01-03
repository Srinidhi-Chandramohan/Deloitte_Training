package com.deloitte.movie.DAO;

import java.sql.*;
import java.util.ArrayList;

import com.deloitte.movie.model.AdminSignup;



public class AdminDAO {
	public static Connection connectToDB() {
		Connection connection = null;
		// Step 1: Register the driver.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Step 2: Create connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
						
			
	public static void signUp(AdminSignup a) {
		// TODO Auto-generated method stub
		try {

			// Statement stmt = connectToDB().createStatement();

			Connection con=connectToDB();
			
			PreparedStatement stmt = con.prepareStatement("insert into movieAdmin values(?,?,?,?)");
			stmt.setString(1,a.getUserName());
			stmt.setString(2,a.getEmail());
			stmt.setString(3,a.getPassword());
			stmt.setDouble(4,a.getPhone());
			
			int affectedRows = stmt.executeUpdate();
			System.out.println("No.of accounts created " + affectedRows);
			//Step 5:Close Connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static boolean login(String id, String pswd) {
		// TODO Auto-generated method stub
		try {
			ArrayList<AdminSignup> list =new ArrayList<AdminSignup>();

			// Statement stmt = connectToDB().createStatement();

			Connection con=connectToDB();
			
			PreparedStatement stmt = con.prepareStatement(""
					+ "select userName,password from movieAdmin where userName=? and password=?");
		   /* String chck_logId="admin";
	        String chck_pswd="admin@123"; */
			stmt.setString(1, id);
			stmt.setString(2, pswd);
			ResultSet rs =stmt.executeQuery();
			while(rs.next()) {
				return true;
			}
			con.close();
				
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
			
			
		
	
		
	}



	public static ArrayList<AdminSignup> dispAllUsers() {
		// TODO Auto-generated method stub
		try {
			ArrayList<AdminSignup> users =new ArrayList<AdminSignup>();

			// Statement stmt = connectToDB().createStatement();

			Connection con=connectToDB();
			
			PreparedStatement stmt = con.prepareStatement("select * from movieAdmin ");
		   /* String chck_logId="admin";
	        String chck_pswd="admin@123"; */
			ResultSet rs =stmt.executeQuery();
			while(rs.next()) {
				AdminSignup disp=new AdminSignup();
				disp.setUserName(rs.getString(1));
				disp.setPassword(rs.getString(3));
				disp.setEmail(rs.getString(2));
				disp.setPhone(rs.getDouble(4));
				users.add(disp);
			}
			con.close();
			return users;	
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		return null;
		
		
		
	}
		
		}
	
	

