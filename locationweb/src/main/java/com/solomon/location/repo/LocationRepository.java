package com.solomon.location.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.solomon.location.entities.Location;

public interface LocationRepository extends JpaRepository <Location, Integer>  {

    @Query(value="select type,count(type) from location group by type")	
	public List<Object[]> findTypeandTypeCount();
}
