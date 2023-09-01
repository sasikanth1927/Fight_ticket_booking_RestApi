package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FlightDetails")
public class FlightModel {

	@Id
	private int flightId;
	private String flightName;
	private String fromCity;
	private String toCity;
	private String departureTime;
	private String arrivalTime;
	private String travelDuration;
	private int economyFare;
	private int businessFare;
	public FlightModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightModel(int flightId, String flightName, String fromCity, String toCity, String departureTime,
			String arrivalTime, String travelDuration, int economyFare, int businessFare) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.travelDuration = travelDuration;
		this.economyFare = economyFare;
		this.businessFare = businessFare;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getTravelDuration() {
		return travelDuration;
	}
	public void setTravelDuration(String travelDuration) {
		this.travelDuration = travelDuration;
	}
	public int getEconomyFare() {
		return economyFare;
	}
	public void setEconomyFare(int economyFare) {
		this.economyFare = economyFare;
	}
	public int getBusinessFare() {
		return businessFare;
	}
	public void setBusinessFare(int businessFare) {
		this.businessFare = businessFare;
	}
	
	
	
}
