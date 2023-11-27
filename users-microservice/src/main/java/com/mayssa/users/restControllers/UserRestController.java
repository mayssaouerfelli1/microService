package com.mayssa.users.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayssa.users.entities.User;
import com.mayssa.users.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/allUsers")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<User> getAllUsers() {
	   return userService.findAllUsers();
	}
	}

	
 
