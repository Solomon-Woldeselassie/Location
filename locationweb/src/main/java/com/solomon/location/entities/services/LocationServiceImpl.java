package com.solomon.location.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solomon.location.entities.Location;
import com.solomon.location.repo.Repository;
@Service
public class LocationServiceImpl implements LocationServices {
	@Autowired
	private Repository repository;

	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}
    @Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getById(int id) {
		return repository.getOne(id);
	}

	@Override
	public List<Location> getAllByLocation() {
		return repository.findAll();
	}

}
