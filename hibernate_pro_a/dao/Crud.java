package com.te.hibernate_pro_a.dao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate_pro_a.dto.Director;
import com.te.hibernate_pro_a.dto.Movies;

public class Crud {
	

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dmunit01");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Scanner scanner=new Scanner(System.in);
	
	public void insert() {
		
		System.out.println(" first Movie Details\n");
		Movies movies = new Movies();
		System.out.println("Enter the actor name");
		movies.setActor_name(scanner.next());
		System.out.println("Enter the movie name");
		movies.setMovie_name(scanner.next());

		System.out.println("Second movie details\n");
		Movies movies1 = new Movies();
		System.out.println("Enter the Actor Name");
		movies1.setActor_name(scanner.next());
		System.out.println("Enter the movie name");
		movies1.setMovie_name(scanner.next());

		ArrayList<Movies> arrayList = new ArrayList<Movies>();
		arrayList.add(movies1);
		arrayList.add(movies);

		 System.out.println("Director details\n");
		Director director = new Director();
		
		
		System.out.println("Enter the director name");
		director.setD_name(scanner.next());
		System.out.println("Enter the mobile number");
		director.setPhone_number(scanner.nextLong());
		
		director.setMovies(arrayList);

		movies.setDirector(director);
		movies1.setDirector(director);

		entityTransaction.begin();
		entityManager.persist(director);
		entityTransaction.commit();

	}

	public void read() {
		
		System.out.println("Enter the director Id");
		Director director = entityManager.find(Director.class, scanner.next());
		System.out.println(director);
		System.out.println("Enter the actor id");
		Movies movies = entityManager.getReference(Movies.class,scanner.next());
		System.out.println(movies);
       }
	
	
	public void delete() {
		 System.out.println("Enter the Director Id to delete :");
		Director director = entityManager.find(Director.class, scanner.nextInt());
		System.out.println(director);

		entityTransaction.begin();
		entityManager.remove(director);
		entityTransaction.commit();
		
	}
	
	public void update() {
		
		System.out.println(" Enter the Changes or updates first select the id of Director");
		Director director = entityManager.find(Director.class,scanner.nextInt());
		System.out.println("Enter the Director name");
		director.setD_name(scanner.next());

		System.out.println("Enter the changes or updates first select Actor Id\n");
		Movies movies = entityManager.find(Movies.class, scanner.nextInt());
		System.out.println("Enter the actor name");
		movies.setActor_name(scanner.next());

		entityTransaction.begin();
		entityManager.persist(director);
		entityManager.persist(movies);
		entityTransaction.commit();
		
	}
		
		
	}


