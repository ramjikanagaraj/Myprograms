package com.online.shopping.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.shopping.dto.UserRegistration;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String getHello(@PathParam("name") String name){
		return "Hello World"+name;
	}
	
	@PostMapping("/dataSave")
	public String saveData(@RequestBody UserRegistration userRegistration){
		return userRegistration.toString();
	}
	
}
