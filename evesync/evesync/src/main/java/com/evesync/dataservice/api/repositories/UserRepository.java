package com.evesync.dataservice.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evesync.dataservice.api.dto.UserPostDto;
import com.evesync.dataservice.api.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByFirstname(String firstname);
	
	Optional<User> findByLastname(String lastname);

	Optional<User> findById(int id);
	
	Optional<User> findByUsername(String username);
	
	

	
}