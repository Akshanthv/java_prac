package com.evesync.dataservice.api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import com.evesync.dataservice.api.entities.User;
import com.evesync.dataservice.api.repositories.UserRepository;
import com.evesync.dataservice.api.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public Boolean authenticate(User user) {
		Optional<User> loggedInUser=userRepository.findByUsername(user.getUsername());
		if(loggedInUser.isPresent()) {
			if(loggedInUser.get().getPassword().equals(user.getPassword()))
				return true;
			else
				return false;
		}
			
		else 
			return false;
	}
	
	@Override
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@Override
	public User getUserById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new HttpStatusCodeException(HttpStatus.NOT_FOUND, "User not found with ID: " + userId) {
				private static final long serialVersionUID = 1L;
			};
		}
	}



	@Override
	public User getUserByUsername(String username) {
		Optional<User> user = userRepository.findByUsername(username);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new HttpStatusCodeException(HttpStatus.NOT_FOUND, "User not found with ID: " + username) {
				private static final long serialVersionUID = 1L;
			};
		}
		
	}

	@Override
	public User getUserByfirstname(String firstname) {
		Optional<User> user = userRepository.findByFirstname(firstname);
		if (user.isPresent())
			return user.get();
		else{
			throw new HttpStatusCodeException(HttpStatus.NOT_FOUND, "User not found with ID: " + firstname) {
				private static final long serialVersionUID = 1L;
			};
		}
			
	}

	@Override
	public User getUserBylastname(String lastname) {
		Optional<User> user = userRepository.findByLastname(lastname);
		if (user.isPresent())
			return user.get();
		else{
			throw new HttpStatusCodeException(HttpStatus.NOT_FOUND, "User not found with ID: " + lastname) {
				private static final long serialVersionUID = 1L;
			};
		}
	}

	@Override
	public User postUserByUsername(String username) {
		Optional<User> user = userRepository.findByUsername(username);
		if (user.isPresent()) {
			return user.get();
		} else {
			 return null;
			}
		}

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}