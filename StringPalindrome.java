package com.te.java.assignment;

public class StringPalindrome {
	
	public static void main(String[] args) {

		int r, sum = 0, temp;

		// It is the number variable to be checked for palindrome		
		int n = 456;

		temp = n;
		
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

}



