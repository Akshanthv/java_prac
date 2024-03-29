package com.evesync.dataservice.api.services;

import java.util.List;

import com.evesync.dataservice.api.dto.UserPostDto;
import com.evesync.dataservice.api.entities.User;

public interface UserService{
	
	public Boolean authenticate(User user);
	
	public List<User> getAllUsers();
	
//	public List<Post> getPostsList();
	
	public User getUserById(Long id);
	
	public User getUserByUsername(String username);
	
	public User postUserByUsername(String username);
	
	public User getUserByfirstname(String firstname);
	
	public User getUserBylastname(String lastname);

	public void saveUser(User user);

	
}