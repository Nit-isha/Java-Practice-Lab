package com.lab1;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the range for Fibonacci Series : ");
		int range = sc.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1);
		
		//Non-Recursive way
		for (int i = 2; i <= range; i++) {
			System.out.print(" | "+num2);
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
		}
		System.out.println("\nNth value is : "+num1);
		
		sc.close();
	}
}

