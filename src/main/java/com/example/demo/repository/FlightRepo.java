package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.FlightModel;

public interface FlightRepo extends JpaRepository<FlightModel, Integer> {

	@Query(value="Select * from flight_details where flight_id=:s",nativeQuery = true)
	public List<FlightModel> getqid (@Param("s") int id);
	
	@Query(value="Select * from flight_details where economy_fare=:s",nativeQuery = true)
	public List<FlightModel> getqefare (@Param("s") int id);
	
	@Query(value="Select * from flight_details where from_city=:s and to_city=:x",nativeQuery = true)
	public List<FlightModel> getqecity (@Param("s") String n1,@Param("x") String n2);
}