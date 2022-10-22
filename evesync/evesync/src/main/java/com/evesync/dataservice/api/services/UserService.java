package com.evesync.dataservice.api.services;

import java.util.List;

import com.evesync.dataservice.api.entities.User;

public interface UserService{
	
	public Boolean authenticate(User user);
	
	public User registerUser(User user);
	
	public List<User> getAllUsers();
	
	public User getUserById(Long Id);
	
	public User getUserByUsername(String username);
	
	public User postUserByUsername(String username);
	
	public User getUserByfirstname(String firstname);
	
	public User getUserBylastname(String lastname);
	
}