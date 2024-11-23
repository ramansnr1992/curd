package com.curdsample.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.curdsample.in.model.Location;
import com.curdsample.in.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	@PostMapping
	public Location saveLocation(@RequestBody Location location) {
		
		return locationRepository.save(location);
	}
	
	
	
	
}
