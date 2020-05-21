package com.solomon.flightregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solomon.flightregistration.entities.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
