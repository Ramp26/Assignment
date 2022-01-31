package com.te.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.student.bean.StudentDetails;
import com.te.student.dao.StudentDao;

@Service
public class StudentServiceImp implements StudentService{
	
    @Autowired
	private StudentDao dao;
	@Override
	public StudentDetails authenticate(int rollno, String password) {
		if (rollno<=0) {
			return null;
		}
		return dao.authenticate(rollno, password);
	}
	@Override
	public boolean adddata(StudentDetails details) {
		if (details!=null) {
			return dao.adddata(details);
		}
		return false;
	}
	@Override
	public boolean deletedata(int rollno) {
		if (rollno<=0) {
			return false;
		}
		return dao.deletedata(rollno);
	}
	@Override
	public StudentDetails showData(int rollno) {
		if (rollno<=0) {
			return null;
		}
		return dao.showData(rollno);
	}
	@Override
	public StudentDetails updatedata(StudentDetails details, StudentDetails details2) {
		
		return dao.updatedata(details, details2);
	}
	@Override
	public List<StudentDetails> showDataAll() {
		
		return dao.showDataAll();
	}

}
