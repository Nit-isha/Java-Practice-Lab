package com.lab5;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		if (age < 15) {
			try {
				throw new ageException();
			}
			catch(Exception e) {
				System.out.println("Age less than 15.");
			}
		}
		else {
			System.out.println("Age is more than 15");
		}
	}
}


