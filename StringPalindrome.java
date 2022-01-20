package com.te.java.assignment;

public class StringPalindrome {
	
	public static void main(String[] args) {

		int m, sum = 0, temp;

		// It is the number variable to be checked for palindrome		
		int n = 454;

		temp = n;
		
		while (n > 0) {
			m = n % 10; // getting remainder
			sum = (sum * 10) + m;
			n = n / 10;
		}
		
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

}



