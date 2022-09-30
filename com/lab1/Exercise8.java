package com.lab1;
import java.util.*;

public class Exercise8 {
	
	static boolean checkPowerOfTwo(int num) {
		
		while (num != 1) {
			if (num % 2 != 0) {
				return false;
			}
			num /= 2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Result : "+ checkPowerOfTwo(num));
		
		sc.close();
	}
}
