package com.lab5;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your full name : ");
		String fullName = sc.nextLine();
		int count = 0;
		
		fullName.trim();
		
		for (int i = 0; i < fullName.length(); i++) {
			char ch = fullName.charAt(i);
			if (ch == ' ') {
				count += 1;
			}
		}

		try {
			if(count != 1) {
				throw new NameValidationException();
			}
			else {
				System.out.println("Name Validated..");
			}
		}
		catch(NameValidationException e) {
			System.out.println("Please enter [FirstName] -space- [LastName].");
		}
	}
}
