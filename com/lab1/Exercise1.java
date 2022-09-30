package com.lab1;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		int num = sc.nextInt();
		int result = 0;

		
		while (num > 0) {
			int digit = num % 10;
			result += digit*digit*digit;
			num = num/10;	
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
