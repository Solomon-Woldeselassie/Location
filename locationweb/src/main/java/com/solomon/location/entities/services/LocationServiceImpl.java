package com.solomon.location.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solomon.location.entities.Location;
import com.solomon.location.repo.LocationRepository;
@Service
public class LocationServiceImpl implements LocationServices {
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}
    @Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);
	}

	@Override
	public Location getById(int id) {
		return locationRepository.getOne(id);
	}

	@Override
	public List<Location> getAllByLocation() {
		return locationRepository.findAll();
	}

}
