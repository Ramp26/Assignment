package com.te.hibernate_pro_a.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@Entity
@Table(name="Movies_table")
public class Movies implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int m_Id;
	@Column(name="Movie_Name")
	  private String Movie_name;
	@Column(name="Actor")
	  private  String Actor_name;

	@ManyToOne(cascade = CascadeType.ALL)
	  private Director director;
	
	public Movies(int m_Id, String movie_name, String actor_name, int release_Date, Director director) {
		super();
		this.m_Id = m_Id;
		Movie_name = movie_name;
		Actor_name = actor_name;
		this.director = director;
	}

	

	

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getM_Id() {
		return m_Id;
	}

	public void setM_Id(int m_Id) {
		this.m_Id = m_Id;
	}

	public String getMovie_name() {
		return Movie_name;
	}

	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}

	public String getActor_name() {
		return Actor_name;
	}

	public void setActor_name(String actor_name) {
		Actor_name = actor_name;
	}

	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}



	@Override
	public String toString() {
		return "Movies [m_Id=" + m_Id + ", Movie_name=" + Movie_name + ", Actor_name=" + Actor_name + 
				  ", director=" + director + "]";
	}

		
	
	  
}
