
package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookingModel;
import com.example.demo.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bs;
	 @PostMapping("addbooking")
	 public BookingModel addBooking( @RequestBody BookingModel bm)
	 {
		 return bs.addbookinginfo(bm);
	 }
	 
	 @PostMapping("addnbooking")
	 public List<BookingModel> addnBooking( @RequestBody List<BookingModel> bm)
	 {
		 return bs.addnbookinginfo(bm);
	 }
	 
	 @GetMapping("showbooking")
	 public List<BookingModel> displayBookings()
	 {
		 return bs.showbookinginfo();
	 }
	 
	 @GetMapping("showbooking/{id}")
	 public Optional<BookingModel> getById(@PathVariable int id)
	 {
		 return bs.showbyid(id);
	 }
	 
	 @GetMapping("showbookingsorted/{name}")
	 public List<BookingModel> getbysorted(@PathVariable String name)
	 {
		 return bs.showsortedinfo(name);
	 }
	 
	 @GetMapping("showbookingpage/{pgno}/{pgsize}")
	 public List<BookingModel> getbypage(@PathVariable int pgno,@PathVariable int pgsize)
	 {
		 return bs.showinfobypage(pgno, pgsize);
	 }
	 
	 @GetMapping("showbookingpage/{pgno}/{pgsize}/{name}")
	 public List<BookingModel> getbypageandsort(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String name)
	 {
		 return bs.showinfobypageandsort(pgno, pgsize,name);
	 }
	 
	 @GetMapping("showbookingqs/{status}")
	 public List<BookingModel> getbyqstatus(@PathVariable String status)
	 {
		 return bs.showinfopaymentstatus(status);
	 }
	 
	 @GetMapping("showbookingqt/{type}")
	 public List<BookingModel> getbyqtype(@PathVariable String type)
	 {
		 return bs.showinfobookingtype(type);
	 }
	 
	 @DeleteMapping("deletebooking")
	 public String deleteAll()
	 {
		 bs.removeinfo();
		 return "Successfully deleted all the records !!! " ;
	 }
	 
	 @DeleteMapping("deletebooking/{id}")
	 public String deletebyId(@PathVariable int id)
	 {
		 bs.removeinfobyid(id);
		 return "Successfully deleted records with "+id;
	 }
}
