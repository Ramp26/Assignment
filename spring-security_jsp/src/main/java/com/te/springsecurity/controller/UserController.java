package com.te.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.te.springsecurity.dto.User;
import com.te.springsecurity.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/putdata")
	public String putdata(User user, ModelMap map) {
	User user2=	service.putdata(user);
	if(user2!=null) {
		map.addAttribute("msg", "Inserted successfully");
		return "welcome";
	}else {
		map.addAttribute("msg", "Invalid Entry");
		return"regform";
	}
	}

	@GetMapping("/details")
	public String featchdata() {

		return "showdata";

	}

	@PostMapping("/details")
	public String featchdata(int id, ModelMap map) {
		User user = service.featchdata(id);
		if(user!=null) {
		map.addAttribute("msg", user);
		return "showdata";
		}else {
			map.addAttribute("errmsg", "id not found");
			return "showdata";
		}
		
		

	}
	
	@GetMapping("/delete")
	public String deletedata() {
		
		return "deleteform";
		
	}

	@PostMapping("/delete")
	public String deletedata(int id,ModelMap map) {
		
	Boolean user= service.deletedata(id);
	if(user!=false) {
	 map.addAttribute("msg", "Successfully deleted!!");
		return"deleteform";
	}else {
	      map.addAttribute("msg", "id is not found");   
	  	return "deleteform";
	}
		
	}
	
	
	@GetMapping("/update")
	public String updatedata() {
		
		return  "updateform";
		
	}
	
	@PostMapping("/update")
	public String updatedata(User user,ModelMap map) {
	boolean user1=	service.updatedata(user);
	if(user1!=false) {
		map.addAttribute("msg", "update successfully");
		return "updateform";
	}else {
		map.addAttribute("msg", "something went wrong");
		return"updateform";
	}
		
	}
	
	
	@GetMapping("/showall")
	public String showall(ModelMap  map) {
		
		List<User> users=service.showall();
		
		map.addAttribute("data", users);
		return "showall";
		
	}
	
	@GetMapping("/")
	public String home() {

		return "welcome";

	}
	
	

	@GetMapping("/reg")
	public String reg() {
		return "regform";

	}

	@GetMapping("/admin")
	public String admin() {
		return "adminhome";

	}

	@GetMapping("/user")
	public String user() {

		return "userhome";

	}

}
