package com.te.hibernate_pro_a.service;

import java.io.InputStream;
import java.util.Scanner;

import com.te.hibernate_pro_a.dao.Crud;

public class CrudTest {
	
	public static void main(String[] args) {
		
		Crud crud=new Crud();
		Scanner scanner=new Scanner(System.in);
		System.out.println("for insert select 1 \n for Read slect 2 \n for Delete select 3 \n for update select 4");
		  
		int Selection=scanner.nextInt();
		
	switch (Selection) {
	  case 1:  crud.insert();
	    System.out.println("Insertion is successfull");
		break;
	  case 2:  crud.read();
	    System.out.println("read  is successfull");
		break;
	  case 3:  crud.delete();
	    System.out.println("Deletion is successfull");
		break;
	  case 4:  crud.update();
	    System.out.println("update is successfull");
		break;
		
	default: System.out.println("invalid entry");
		break;
	}
		
	}

	

}
