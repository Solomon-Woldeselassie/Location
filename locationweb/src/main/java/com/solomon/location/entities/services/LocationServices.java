package com.solomon.location.entities.services;

import java.util.List;


import com.solomon.location.entities.Location;

public interface LocationServices {
	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getById(int id);

	List<Location> getAllByLocation();

}
