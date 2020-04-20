package com.managementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.managementsystem.model.Users;

@Repository
public class MngSysDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	public List<Users> getAllUsers() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Users> query = currentSession.createQuery("from Users", Users.class);
		List<Users> usersList = query.getResultList();
		return usersList;
	}

	public Users saveUser(Users user) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(user);
		return user;
	}
	
}
