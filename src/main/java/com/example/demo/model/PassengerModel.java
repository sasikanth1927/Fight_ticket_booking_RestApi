package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PassengerDetails")
public class PassengerModel {
  @Id
  private long passengerId;
  private String passengerName;
  private int age;
  private String gender;
public PassengerModel() {
	super();
	// TODO Auto-generated constructor stub
}
public PassengerModel(long passengerId, String passengerName, int age, String gender) {
	super();
	this.passengerId = passengerId;
	this.passengerName = passengerName;
	this.age = age;
	this.gender = gender;
}
public long getPassengerId() {
	return passengerId;
}
public void setPassengerId(long passengerId) {
	this.passengerId = passengerId;
}
public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
  
}
