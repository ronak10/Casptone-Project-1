package com.Capstone.jersey_rest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserRepository {
	
	
	Connection con = null; 
	
	public UserRepository() {
		String url ="jdbc:mysql://localhost:3307/restdb";
		String username = "root";
		String password ="rohith@niit";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connected to jdbc");
		con = DriverManager.getConnection(url,username,password);
		  System.out.println("Driver manager  created");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public List<User> getUsers()
	{
		List<User> users = new ArrayList<>();
		String sql ="select * from user";
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
				{
					User a = new User();
					a.setId(rs.getInt(1));
					a.setuser_name(rs.getString(2));
					a.setdescription(rs.getString(3));
					//a.setCreatedAt(rs.getTimestamp(4));	
					users.add(a);
				}
		}catch(Exception e) {
			System.out.println(e);
		}
		return users; 
	}
	
	public User getUser(int id)
	{
		String sql ="select * from user where id="+id;
		User a = new User();
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if(rs.next())
				{
					
					a.setId(rs.getInt(1));
					a.setuser_name(rs.getString(2));
					a.setdescription(rs.getString(3));
					
					
				}
		}catch(Exception e) {
			System.out.println(e);
		}
		return a;
		
	}

	public void create(User a1) {
		String sql = "insert into user(id,user_name,description) values(?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, a1.getId());
			st.setString(2, a1.getuser_name());
			st.setString(3, a1.getdescription());
			System.out.println("Here");
			st.executeUpdate();
			
			}catch(Exception e) {
				System.out.println("Prob");
				System.out.println(e);
			}
	}

	public void update(User a1) {
		String sql = "update user set user_name=? ,description=? where id =?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(3, a1.getId());
			st.setString(1, a1.getuser_name());
			st.setString(2, a1.getdescription());
			st.executeUpdate();
			
			}catch(Exception e) {
				System.out.println(e);
			}
	}

	public void delete(int id) {
		String sql = "delete from user where id =?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			
			st.executeUpdate();
			
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}

	
	
}
