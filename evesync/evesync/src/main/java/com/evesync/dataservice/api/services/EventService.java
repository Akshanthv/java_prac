package com.evesync.dataservice.api.services;

import java.util.List;

import com.evesync.dataservice.api.entities.Event;

public interface EventService{
	
	
	public Event getEventById(Long Id);
	
	public Event getEventByTitle(String title);
	
	public Event getEventByLocation(String location) ;
	
	public Event getEventByType(String type);
	
	
	public List<Event> getAllEvents();
	
}