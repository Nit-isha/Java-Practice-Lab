package com.lab1;
import java.util.*;

public class Exercise5 {
	
	static int calculateSum(int n) {
		int sum = 0;
		
		for (int i = 1; i<= n; i++) {
			if (i%3 == 0 | i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the range : ");
		int range = sc.nextInt();
		
		System.out.println("Sum of numbers divisible by 3 OR 5 : "+ calculateSum(range));
		
		sc.close();
	}

}
