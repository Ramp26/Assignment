package com.te.student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.student.bean.StudentDetails;
import com.te.student.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService sevice;

	@GetMapping("/login")
	public String authenticate() {
		return "login";

	}

	@PostMapping("/login")
	public String authenticate(int rollno, String password, ModelMap map, HttpServletRequest request) {
		StudentDetails details = sevice.authenticate(rollno, password);
		HttpSession session = request.getSession();
		session.setAttribute("loggedIn", details);
		if (details != null) {
			map.addAttribute("data", details.getName());
			return "welcome";
		} else {
			map.addAttribute("err", "Invalid Cridentials");
			return "login";
		}
	}

	@GetMapping("/add")
	public String addform(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details, ModelMap map) {
		if (details != null) {
			return "addform";
		} else {
			map.addAttribute("err", "please login First!");
			return "login";
		}

	}

	@PostMapping("/add")
	public String adddata(StudentDetails details, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails details2) {
		if (details2 != null) {
			if (sevice.adddata(details)) {
				map.addAttribute("data", "Data inserted Successfully!");
			} else {
				map.addAttribute("err", "Please add Details");
			}
			return "addform";
		} else {
			map.addAttribute("err", "please login First");
			return "login";
		}

	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("err", "Logged Out Successfully !");
		return "login";
	}

	@GetMapping("/delete")
	public String delete(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details, ModelMap map) {
		if (details != null) {
			return "deleteform";
		} else {
			map.addAttribute("err", "Please login First!");
			return "login";
		}

	}

	@PostMapping("/delete")
	public String deletedata(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details, int rollno,
			ModelMap map) {
		if (details != null) {
			if (sevice.deletedata(rollno)) {
				map.addAttribute("msg", "data deleted Successfully!");

			} else {
				map.addAttribute("msg", "data is not Found!");
			}
			return "deleteform";
		} else {
			map.addAttribute("err", "Please login first!");
			return "login";
		}
	}

	@GetMapping("/show")
	public String showData(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details,
			ModelMap map) {
		if (details!=null) {
			return "showdata";
		}else {
			map.addAttribute("err", "Please login first!");
			return "loginform";
		}

	}
	
	@PostMapping("/show")
	public String showData(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details, ModelMap map,
			int rollno) {
		if (details != null) {
			StudentDetails details2 = sevice.showData(rollno);
			if (details2 != null) {
				map.addAttribute("data", details2);
			} else {
				map.addAttribute("err", "Data not found for rollno:" + rollno);
			}
			return "showdata";
		} else {
			map.addAttribute("err", "please login first!");
			return "loginform";
		}
	}
	
	@GetMapping("/update")
	public String update(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details, ModelMap map) {
		if (details != null) {
			map.addAttribute("data", details.getRollno());
			return "update";
		} else {
			map.addAttribute("err", "please login first!");
			return "login";
		}
	}
	
	@PostMapping("/update")
	public String updatedata(StudentDetails details2,@SessionAttribute(name = "loggedIn", required = false) StudentDetails details, ModelMap map) {
		if (details != null) {

			StudentDetails details3 = sevice.updatedata(details2, details);
			if (details3 != null) {
				map.addAttribute("msg", "data Updated Successfully");
				map.addAttribute("data", details.getRollno());

			} else {
				map.addAttribute("msg", "something went wrongs");
			}
			return "update";
	}else

	{
		map.addAttribute("err", "please login first!");
		return "login";
	}
	}
	
	@GetMapping("/showall")
	public String showDataAll(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details,
			ModelMap map) {
		if (details != null) {
			List<StudentDetails> data = sevice.showDataAll();
			if (data != null) {
				map.addAttribute("data", data);
			} else {
				map.addAttribute("err", "Data not found ");
			}
			return "showall";
		} else {
			map.addAttribute("err", "please login first!");
			return "login";
		}
	}

}
