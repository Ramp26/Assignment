package com.te.Assignment.dto;

import java.util.Scanner;

import com.te.Assignment.dao.Create;
import com.te.Assignment.dao.Delete;
import com.te.Assignment.dao.Insert;
import com.te.Assignment.dao.Read;
import com.te.Assignment.dao.Update;

public class TestEmployer {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"for create Employer table click : 1\nFor insert click : 2 \n for select click : 3 \n for delete select : 4 \n for update select : 5");
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("Table is already Created");
//			   Create obj = new Create();
			break;

		case 2:
			Scanner scanner1 = new Scanner(System.in);

			System.out.println("Enter the employee name");
			String name = scanner.next();
			System.out.println("Enetr the employee age");
			int emp_age = scanner1.nextInt();
			Insert obj1 = new Insert(7, name, emp_age);

			break;

		case 3:

			System.out.println("Select Employee age ");
			int emp_age1 = scanner.nextInt();
			Read obj2 = new Read(emp_age1);

			break;

		case 4:

			System.out.println("Select Employee Id ");
			int emp_id = scanner.nextInt();
			Delete obj3 = new Delete(emp_id);

			break;
		case 5:

			System.out.println("Select Employee Id ");
			int emp_id1 = scanner.nextInt();
			System.out.println("Enter Employee name ");
			String emp_name = scanner.next();
			System.out.println("Enter Employee age ");
			int emp_age11 = scanner.nextInt();
			Update obj4 = new Update(emp_id1, emp_name, emp_age11);

			break;

		default:
			System.out.println(" Sorry Invalid Entry");
			break;
		}

	}

}
