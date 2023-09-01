package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="BookingDetails")
public class BookingModel {

	@Id
	private int bookingId;
	
	private String customerName;
	private String paymentStatus;
	private String bookingDate;
	private String travelDate;
	private long contactNumber;
	private String bookingType;
	private int totalAmount;
	private int totalPassengers;

	
	
//	@OneToOne
//	@JoinColumn(name="fk_flightId")

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_passengerId")
	private List<PassengerModel> pmodel;
	public BookingModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingModel(int bookingId, String customerName, String paymentStatus, String bookingDate, String travelDate,
			long contactNumber, String bookingType, int totalAmount, int totalPassengers,
			List<PassengerModel> pmodel) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.paymentStatus = paymentStatus;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.contactNumber = contactNumber;
		this.bookingType = bookingType;
		this.totalAmount = totalAmount;
		this.totalPassengers = totalPassengers;

		this.pmodel = pmodel;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTotalPassengers() {
		return totalPassengers;
	}
	public void setTotalPassengers(int totalPassengers) {
		this.totalPassengers = totalPassengers;
	}

	public List<PassengerModel> getPmodel() {
		return pmodel;
	}
	public void setPmodel(List<PassengerModel> pmodel) {
		this.pmodel = pmodel;
	}
	
	
	
}
