package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.AppUser;
import com.example.demo.Service.UserService;
@RequestMapping("/api/users")
@RestController
public class UserController {
	UserService userService;
	@Autowired
	public UserController(UserService userService){
		this.userService=userService;
	}
	    @GetMapping("/all_users")
	public List<AppUser> getAll() {
		return userService.getAllPeople();
	}
	@PostMapping("/add_user")
	public void save(@RequestBody AppUser user) {
		userService.save(user);
		System.out.println(user);
	}
}
