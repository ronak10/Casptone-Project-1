package com.Capstone.jersey_rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users")
public class UserResource {
	
	
	UserRepository repo = new UserRepository();
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<User> getUsers() {
		System.out.println("user called..");
		
		
		return repo.getUsers();
	}
	

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("user/{id}")
	public User getUser(@PathParam("id") int id) {
		
		
		
		return repo.getUser(id);
	}
	
	@POST
	@Path("user")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User createUser(User a1)
	{
		System.out.println(a1);
		repo.create(a1);
		return a1;
	}
	
	@PUT
	@Path("user")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User updateUser(User a1)
	{
		System.out.println(a1);
		if(repo.getUser(a1.getId()).getId()==0)
		{
			repo.create(a1);
		}
		else
		{
		repo.update(a1);
		}
		return a1;
	}
	
	@DELETE
	@Path("user/{id}")
	public User killUser(@PathParam("id") int id) 
	{
		User a = repo.getUser(id);
		
		if(a.getId()!=0)
		{
			repo.delete(id);
		}
		
		return a;
		
	}
}
