package com.system.dynam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.system.dynam.entity.User;
import com.system.dynam.service.UserService;

@RestController
//@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") long id){
		return userService.getUser(id);
	}
}
