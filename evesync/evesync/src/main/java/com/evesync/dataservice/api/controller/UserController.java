package com.evesync.dataservice.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evesync.dataservice.api.entities.User;
import com.evesync.dataservice.api.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/v1/users/authenticate")
	public Boolean authenticate(@RequestBody User user) {
		return userService.authenticate(user);
	}
	
	@GetMapping("/v1/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/v1/users/{username}")
	public User getUserByUsername(@PathVariable(name="username")String username) {
		return userService.getUserByUsername(username);
	}
	
}