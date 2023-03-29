package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	public User PrintUser(User userPojo) {
		System.out.print(userPojo);
		try {
			UserRepo.saveUser(userPojo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userPojo;
	}
}
