package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PassengerModel;

public interface PassengerRepo extends JpaRepository<PassengerModel, Long>{

}
