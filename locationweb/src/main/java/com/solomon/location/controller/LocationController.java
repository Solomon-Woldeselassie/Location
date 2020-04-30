package com.solomon.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.solomon.location.entities.Location;
import com.solomon.location.entities.services.LocationServices;


@Controller
public class LocationController {
	@Autowired
	LocationServices service;
	
	@RequestMapping("/showCreate")	
	public String showCreate() {
		return "createLocation";
	}
	@RequestMapping("/saveloc")
	public String saveCreate(@ModelAttribute("location") Location location,ModelMap map) {
		Location ser = service.saveLocation(location);
		String msg = "Location has been saved" + ser.getId();
		map.addAttribute("msg",msg);
		return "createLocation";
	}
	@RequestMapping("/viewAll")
	public String displayAll(ModelMap map) {
		List<Location> locations = service.getAllByLocation();
		map.addAttribute("location", locations);
		return "displayLocation";
	}
	@RequestMapping("/deleteRecord")
		public String deleteLocation(@RequestParam("id")int id,ModelMap map) {
			//Location location = service.getById(id);   Make Database call 
		    Location location = new Location();// Assign local variable to reduce database call
		    location.setId(id);
			service.deleteLocation(location);
			List<Location> locations = service.getAllByLocation();
			map.addAttribute("location", locations);
			return "displayLocation";
		}
	@RequestMapping("/updateRecord")
	 public String updateLocation(@RequestParam("id")int id,ModelMap map) {
		   Location locations = new Location();
		   locations.setId(id);
		   map.addAttribute("location", locations);
		   return "updateLocation";
	}
	@RequestMapping("/saveUpdate")
	public String saveUpdate(@ModelAttribute("location") Location location,ModelMap map) {
		service.saveLocation(location);
		List<Location> locations = service.getAllByLocation();
		map.addAttribute("location", locations);
		return "displayLocation";
	}
}
