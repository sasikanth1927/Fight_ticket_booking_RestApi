package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FlightModel;
import com.example.demo.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	FlightService fs;
	
	@PostMapping("add")
	public FlightModel addflight(@RequestBody FlightModel fm)
	{
		return fs.addinfo(fm);
	}
	
	@PostMapping("addall")
	public List<FlightModel> addFlights(@RequestBody List<FlightModel> fm)
	{
		return  (List<FlightModel>) fs.addninfo(fm);
	}
	
	@GetMapping("show")
	public List<FlightModel> displayFlights()
	{
		return fs.showinfo();
	}
	
	@GetMapping("/show/{id}")
	public Optional<FlightModel> displayFlight(@PathVariable int id)
	{
		return fs.showid(id);
	}
	@GetMapping("sort/{name}")
	public List<FlightModel> getSortInfo(@PathVariable String name)
	{
		return fs.getsortinfo (name);
	}
	
	@GetMapping("getpage/{pgno}/{pgsize}")
	public List<FlightModel> getByPage(@PathVariable int pgno,@PathVariable int pgsize)
	{
		return fs.getbypage(pgno, pgsize);
	}
	
	@GetMapping("getpage/{pgno}/{pgsize}/{name}")
	public List<FlightModel> getbySortPage(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String name )
	{
		return fs.getbysortpage(pgno, pgsize, name);
	}
	
	@GetMapping("getqueryid/{id}")
	public List<FlightModel> getqueryid(@PathVariable int id)
	{
		return fs.getdetails(id);
	}
	@GetMapping("getqueryefare/{id}")
	public List<FlightModel> getqueryefare(@PathVariable int id)
	{
		return fs.getefaredetails(id);
	}
	@GetMapping("getquerycity/{n1}/{n2}")
	public List<FlightModel> getquerycity(@PathVariable String n1,@PathVariable String n2)
	{
		return fs.getbyfromandto(n1, n2);
	}
	@DeleteMapping("deleteall")
	public String removeFlights()
	{
          fs.deleteinfo();
		return "ALl Flights are Successfully Deleted";
	}
	@PutMapping("update")
	public FlightModel modify(@RequestBody FlightModel fm)
	{
		return fs.changeinfo(fm);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		fs.deletepvid(id);
		return "Successfully deleted row with id:"+Integer.toString(id);
	}
	
	
}
