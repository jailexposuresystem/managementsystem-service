package com.managementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.managementsystem.model.Users;
import com.managementsystem.service.MngSysService;

@RestController
@RequestMapping("/mngSys")
@CrossOrigin(origins="http://localhost:4200")
public class MngSysController {
	
	@Autowired
	private MngSysService mngSysService;
	
	@RequestMapping(value="/getAllUsers", method = RequestMethod.GET)
	public List<Users> getAllUsers() {
		return mngSysService.getAllUsers();
	}
	
	@RequestMapping(value="/saveUser", method = RequestMethod.POST)
	public Users saveUser(@RequestBody Users user) {
		return mngSysService.saveUser(user);
	}

}
