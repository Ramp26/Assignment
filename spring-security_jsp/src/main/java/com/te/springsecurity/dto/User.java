package com.te.springsecurity.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Data
@Table(name = "user_table")
public class User implements Serializable {

	@Id
	private int userId;

	private String userName;

	private String userPassword;

	private String userRole;

}
