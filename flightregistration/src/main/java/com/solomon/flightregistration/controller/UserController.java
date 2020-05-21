package com.solomon.flightregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.solomon.flightregistration.entities.User;
import com.solomon.flightregistration.repo.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@RequestMapping("/reg")
	public String userReg() {
		return "userReg";
	}

	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "loginform";
	}
	
	@RequestMapping(value="login", method=RequestMethod.Post)
	public String autUser(@RequestParam("email")String email,@RequestParam("password")String password) {
		userRepo.findByEmail("email");
		return" login";
		
	}

}
