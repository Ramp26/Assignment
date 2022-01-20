package com.te.hibernate_pro_a.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import antlr.collections.List;
import java.util.*;
import lombok.Data;

@Entity
@Table(name = "Director_table")

public class Director implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_id;
	@Column(name = "Director_name")
	private String d_name;
	@Column(name = "Contact")
	private long phone_number;

	@OneToMany(mappedBy = "director", cascade = CascadeType.ALL)
	private List<Movies> movies;

	public Director() {

	}

	public Director(int d_id, String d_name, long phone_number, Movies movie) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.phone_number = phone_number;

	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Director [d_id=" + d_id + ", d_name=" + d_name + ", phone_number=" + phone_number + "]";
	}

	public int getD_id() {
		return d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

}
