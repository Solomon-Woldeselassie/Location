package com.solomon.flightregistration.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
@Entity
public class Flight extends Abstractentities {
	private String flightNumber;
	private String operatingAirline;
	private String departureCity;
	private String arriveCity;
	private Date departureOfDate;
	private Timestamp estimateDepartureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArriveCity() {
		return arriveCity;
	}

	public void setArriveCity(String arriveCity) {
		this.arriveCity = arriveCity;
	}

	public Date getDepartureOfDate() {
		return departureOfDate;
	}

	public void setDepartureOfDate(Date departureOfDate) {
		this.departureOfDate = departureOfDate;
	}

	public Timestamp getEstimateDepartureTime() {
		return estimateDepartureTime;
	}

	public void setEstimateDepartureTime(Timestamp estimateDepartureTime) {
		this.estimateDepartureTime = estimateDepartureTime;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirline=" + operatingAirline + ", departureCity="
				+ departureCity + ", arriveCity=" + arriveCity + ", departureOfDate=" + departureOfDate
				+ ", estimateDepartureTime=" + estimateDepartureTime + "]";
	}

}
