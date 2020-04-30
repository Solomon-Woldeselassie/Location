package com.solomon.location;
import com.solomon.location.entities.Location;
import com.solomon.location.repo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LocationwebApplicationTests {
	@Autowired 
	private Repository repository;

	@Test
	public void addLocation() {
		Location loc = new Location();
		loc.setName("IowaCity");
		loc.setCode("52246");
		loc.setType("College Town");
		
		repository.save(loc);	
	}
}
