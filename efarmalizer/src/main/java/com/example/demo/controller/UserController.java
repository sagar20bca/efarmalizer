package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(path = "/save")
	public User save(@RequestBody User user) {
		System.out.println("Hello Controller:"+ user.getAddress());
		User saveData = userService.PrintUser(user);
		System.out.println(saveData);
		return user;
	}
}
