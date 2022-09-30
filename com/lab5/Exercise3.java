package com.lab5;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Salary : ");
		float salary = sc.nextFloat();
		
		try {
			if(salary < 3000) {
				throw new EmployeeException();
			}
			else {
				System.out.println("Your salary is : "+salary);
			}
		}catch(EmployeeException e) {
			System.out.println("Your salary is less than 3000.");
		}
	}
}
