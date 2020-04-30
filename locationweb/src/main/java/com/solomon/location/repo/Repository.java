package com.solomon.location.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.solomon.location.entities.Location;
public interface Repository extends JpaRepository <Location, Integer>  {

}
