package com.twitter.dataservice.api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import com.twitter.dataservice.api.entities.User;
import com.twitter.dataservice.api.repositories.UserRepository;
import com.twitter.dataservice.api.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Boolean authenticate(User user) {
		Optional<User> loggedInUser = userRepository.findById(user.getId());
		if (loggedInUser.isPresent()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<User> getAllUsers() {
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

}
