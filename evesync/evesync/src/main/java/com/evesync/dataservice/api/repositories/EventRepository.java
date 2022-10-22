package com.evesync.dataservice.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evesync.dataservice.api.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
	
	Optional <Event> findById (int id);
	
	Optional <Event> findByTitle (String title);
	
	Optional <Event> findByLocation (String location);
	
}