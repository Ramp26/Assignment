package com.te.student.service;

import java.util.List;

import com.te.student.bean.StudentDetails;

public interface StudentService  {
	
	
	public StudentDetails authenticate(int rollno,String password);
	
	public boolean adddata(StudentDetails details);
	public boolean deletedata(int rollno);
	
	public StudentDetails showData(int rollno);
	
	List<StudentDetails> showDataAll();

	StudentDetails updatedata(StudentDetails details,StudentDetails details2);

}
