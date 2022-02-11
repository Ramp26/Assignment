package com.te.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.springsecurity.dao.UserdaoImpl;
import com.te.springsecurity.dto.MyUserDetails;
import com.te.springsecurity.dto.User;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserdaoImpl impl;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = impl.findByUserName(username);
		return new MyUserDetails(user);
	}

	public User putdata(User user) {
		if (user != null) {
			return impl.save(user);
		} else {
			return null;
		}

	}

	public User featchdata(int id) {
	
			return impl.findByUserId(id);
		
	}

	public Boolean deletedata(int id) {

		User user = impl.findByUserId(id);
		if (user != null) {
			impl.delete(user);
			return true;
		} else {
			return false;
		}

	}

	public boolean updatedata(User user) {
		if (user != null) {
			impl.save(user);

			return true;
		} else {
			return false;
		}

	}
	
	
	public List<User> showall() {
		
	
		return (List<User>) impl.findAll();
		
	}
	

}
