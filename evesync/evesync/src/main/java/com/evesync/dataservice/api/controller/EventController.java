package com.evesync.dataservice.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evesync.dataservice.api.entities.Event;
import com.evesync.dataservice.api.services.EventService;



@RestController
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@GetMapping("/v1/events")
	public List<Event> getAllEvents(){
		return eventService.getAllEvents();
	}
	
}