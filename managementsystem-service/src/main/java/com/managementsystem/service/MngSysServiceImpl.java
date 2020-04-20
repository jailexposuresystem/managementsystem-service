package com.managementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.managementsystem.dao.MngSysDAO;
import com.managementsystem.model.Users;

@Service
public class MngSysServiceImpl implements MngSysService{

	@Autowired
	private MngSysDAO mngSysDAO;
	
	@Transactional
	@Override
	public List<Users> getAllUsers() {
		return mngSysDAO.getAllUsers();
	}

	@Override
	public Users saveUser(Users user) {
		return mngSysDAO.saveUser(user);
	}

}
