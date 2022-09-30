package com.lab1;
import java.util.*;

public class Exercise7 {
	
	static boolean checkNumber(int num) {
		int lastSeen = num%10;
		int current;
		num = num/10;
		
		while (num > 0) {
			current = num % 10;
			if(lastSeen < current) {
				return false;
			}
			lastSeen = current;
			num /= 10;	
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Result : "+ checkNumber(num));
		
		sc.close();
	}
}
