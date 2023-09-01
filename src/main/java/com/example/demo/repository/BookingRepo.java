package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.BookingModel;

public interface BookingRepo extends JpaRepository<BookingModel, Integer>{

	@Query(value="select * from booking_details where payment_status=:s",nativeQuery = true)
	public List<BookingModel> displaybystatus(@Param("s") String name);
	
	
	@Query(value="select * from booking_details where booking_type=:s",nativeQuery = true)
	public List<BookingModel> displaybytype(@Param("s") String name);
	
}
