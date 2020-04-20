package com.managementsystem.service;

import java.util.List;

import com.managementsystem.model.Users;

public interface MngSysService {
	
	public List<Users> getAllUsers();

	public Users saveUser(Users user);

}
