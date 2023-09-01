package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightModel;
import com.example.demo.repository.FlightRepo;

@Service
public class FlightService {

	@Autowired
	FlightRepo fr;
	
	// AddoneFlight
	public FlightModel addinfo(FlightModel fm)
	{
		return fr.save(fm);
	}
	
	public List<FlightModel> addninfo(List<FlightModel> fm)
	{
		return  (List<FlightModel>)fr.saveAll(fm);
	}
	//DisplayAllFlight
	public List<FlightModel> showinfo()
	{
		return fr.findAll();	
	}
	
	//DisplayById
	public Optional<FlightModel> showid(int id)
	{
		return fr.findById(id);
	}
	
	//Displayby @Qurey using id
	
	public List<FlightModel> getdetails(int id)
	{
		return fr.getqid(id); 
	}
	
	//Displayby @Qurey using efare
	
		public List<FlightModel> getefaredetails(int id)
		{
			return fr.getqefare(id); 
		}
		
	//Display by from and to city
		public List<FlightModel> getbyfromandto (String n1,String n2)
		{
			return fr.getqecity(n1, n2);
		}
	
	//updateFlight
	public FlightModel changeinfo(FlightModel fm)
	{
//
		return fr.saveAndFlush(fm);
	}
	//DeleteAllFLight
	public void deleteinfo()
	{
		fr.deleteAll();
	}
	
	//deleteFlightbyid
	 
	public void deletepvid(int id)
	{
		fr.deleteById(id);
	}
	
	//GetFlightby Sorted name
	 public List<FlightModel> getsortinfo(String s)
	 {
		 return fr.findAll(Sort.by(Sort.Direction.DESC,s));
	 }
	 
	 //GetFlight by pagination
	 public List<FlightModel> getbypage(int pgno,int pgsize)
	 {
		 Page<FlightModel> p=fr.findAll(PageRequest.of(pgno, pgsize));
		 return p.getContent();
	 }
	 
	 //GEtFlight by pagination and sorting
	 public List<FlightModel> getbysortpage(int pgno,int pgsize,String s)
	 {
		 Page<FlightModel> p=fr.findAll(PageRequest.of(pgno, pgsize,Sort.Direction.DESC,s));
		 return p.getContent();
	 }
	 
	 
}
