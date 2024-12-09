package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bookentity;
import com.example.demo.respository.Bookrespository;

@RestController
public class Bookcontroller {
@Autowired
     public Bookrespository brepo;
@PostMapping("/addbook")
public Bookentity addbook(@RequestBody Bookentity mov) {
	try {
		brepo.save(mov);
		return mov;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@PutMapping("/updatebook")
public Bookentity updatebook(@RequestBody Bookentity mov) {
	try {
		brepo.save(mov);
		return mov;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@GetMapping("/getbook")
public List<Bookentity> getbook(){
	try {
		return brepo.findAll();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@DeleteMapping("/deletebook/{bookid}")
public String deletebook(@PathVariable int bookid) {
	try {
		Bookentity mov = brepo.getOne(bookid);
		brepo.delete(mov);
		return "Book has been removed";
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
}
