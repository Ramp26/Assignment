package com.te.springsecurity.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.springsecurity.dto.User;

public interface UserdaoImpl extends CrudRepository<User, Integer> {
	
	public User findByUserName(String userName);
	public User findByUserId(int id);
		
	
		
	

}
