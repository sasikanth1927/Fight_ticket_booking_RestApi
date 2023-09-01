package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookingModel;
import com.example.demo.repository.BookingRepo;

@Service
public class BookingService {

	@Autowired
	BookingRepo br;
	
	//AddBooking
	public BookingModel addbookinginfo(BookingModel bm)
	{
		return br.save(bm);
	}
	
	//AddMultipleBooking
		public List<BookingModel> addnbookinginfo(List<BookingModel> bm)
		{
			return br.saveAll(bm);
		}
		
	//displayBookings
	public List<BookingModel> showbookinginfo()
	{
		return br.findAll();
	}
	
	//getBookings by Id
	 public Optional<BookingModel> showbyid(int id)
	 {
		 return br.findById(id);
	 }
	 
	 // delete all bookings
	 public void removeinfo()
	 {
		  br.deleteAll();
	 }
	 
	 // delete bookings by id
	 public  void removeinfobyid(int id)
	 {
		 br.deleteById(id);
	 }
	 
	 //get bookings by sorted
	 
	 public List<BookingModel>showsortedinfo(String s)
	 {
		 return br.findAll(Sort.by(Sort.Direction.ASC,s));
	 }
	 
	 // get bookings by pagination
	 
	 public List<BookingModel> showinfobypage(int pgno,int pgsize)
	 {
		 Page<BookingModel> p=br.findAll(PageRequest.of(pgno, pgsize));
		 return p.getContent();
	 }
	 // pagination and sorting
	 
	 public List<BookingModel> showinfobypageandsort(int pgno,int pgsize,String s)
	 {
		 Page<BookingModel> p=br.findAll(PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.ASC,s)));
		 return p.getContent();
		 
	 }
	 
	 // @Query for payment status
	 public List<BookingModel> showinfopaymentstatus(String name)
	 {
		 return br.displaybystatus(name);
	 }
	 
	 // @Query for booking Type
	 public List<BookingModel> showinfobookingtype(String name)
	 {
		 return br.displaybytype(name);
	 }
	
	
	
	
}
