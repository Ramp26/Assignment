package com.te.student.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "stu_tb")
public class StudentDetails implements Serializable {
	@Id
	private int rollno;
	private String name;
	private String address;
	private String password;
	private long phoneno;
	

}
