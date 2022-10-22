package com.evesync.dataservice.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evesync.dataservice.api.entities.Event;
import com.evesync.dataservice.api.repositories.EventRepository;
import com.evesync.dataservice.api.services.EventService;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	EventRepository eventRepository;
	
	@Override
	public List<Event> getAllEvents(){
	return eventRepository.findAll();
	}

	@Override
	public Event getEventById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event getEventByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event getEventByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event getEventByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
	