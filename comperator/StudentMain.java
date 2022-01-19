package com.te.assaignment.comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(2, "Adrsh", 78));
		arrayList.add(new Student(5, "Basu", 68));
		arrayList.add(new Student(3, "Harsh", 80));
		arrayList.add(new Student(1, "Ajit31", 33));

		Scanner scanner = new Scanner(System.in);
		System.out.println("press 1 to sort by id \n press 2 to sort by Marks \n press 3 to sort by name");
		int userInput = scanner.nextInt();
		switch (userInput) {
		case 1:
			Collections.sort(arrayList, new SortById());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;

		case 2:
			Collections.sort(arrayList, new SortByMarks());
			for (Student student : arrayList) {

				System.out.println(student);
			}
			break;
			
		case 3:
			Collections.sort(arrayList, new SortByName());
			for (Student student : arrayList) {

				System.out.println(student);
			}
			break;

		default:System.out.println("Invalid entry");
			break;
		}

	}

}
