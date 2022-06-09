package com.twitter.dataservice.api.services;

import java.util.List;

import com.twitter.dataservice.api.entities.User;

public interface UserService {

	public Boolean authenticate(User user);
	
	public List<User> getAllUsers();
		
	public User getUserById(Long userId);
}
