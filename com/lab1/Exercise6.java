package com.lab1;
import java.util.*;

public class Exercise6 {
	
	static int difference(int n) {
		
		int sumOfSquare = (n*(n+1)*(2*n+1))/6;
		int sum = (n*(n+1))/2;
		int sqOfSum = sum * sum;
		
		return (sumOfSquare - sqOfSum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the range : ");
		int range = sc.nextInt();
		
		System.out.println("Result : "+ difference(range));
		
		sc.close();
	}
}
