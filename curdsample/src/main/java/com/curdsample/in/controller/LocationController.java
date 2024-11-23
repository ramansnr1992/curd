package com.curdsample.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curdsample.in.model.Location;
import com.curdsample.in.repository.LocationRepository;
import com.curdsample.in.service.LocationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@PostMapping
	public Location createlocation(@RequestBody Location location) {

		return locationService.saveLocation(location);
	}
	
	
}
