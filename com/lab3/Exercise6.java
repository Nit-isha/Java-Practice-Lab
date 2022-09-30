package com.lab3;

import java.util.Scanner;

public class Exercise6 {
	
	static boolean checkPositiveString(String s) {
		for(int i=1; i < s.length(); i++) {
			int ch1 = s.charAt(i);
			int ch0 = s.charAt(i-1);
			
			if(ch1 - ch0 < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String str = sc.next();
		
		if(checkPositiveString(str)) {
			System.out.println("Positive String");
		}else {
		System.out.println("Negative String");
		}
		sc.close();
	}
}
