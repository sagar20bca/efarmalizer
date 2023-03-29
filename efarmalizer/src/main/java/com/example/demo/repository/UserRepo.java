package com.example.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
	
	public static void saveUser(User user)throws Exception {
	
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
		 Statement statement = connection.createStatement();
		System.out.print("Name: "+user.getName());
		String sql = "INSERT INTO user (name, contactNumber, address) VALUES ('" +user.getName() +"', '"+ user.getContactNumber()+"', '" + user.getAddress()+"')";
		// String sql = "INSERT INTO user (name, contactNumber, address) VALUES ('value1', 'value2', 'value3')";
		
		statement.executeUpdate(sql);
		statement.close();
		connection.close();

	}
}
