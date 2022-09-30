package com.lab3;

import java.util.*;

public class Exercise4 {
	
	static int modifyNumber(int num) {
		StringBuffer res = new StringBuffer();
		String s = String.valueOf(num);
		
		for(int i = 1; i < s.length(); i++) {
			int difference = Math.abs(Integer.parseInt(String.valueOf(s.charAt(i))) - Integer.parseInt(String.valueOf(s.charAt(i-1))));
			res.append(difference);
		}
		
		res.append(Math.abs(Integer.parseInt(String.valueOf(s.charAt(s.length()-1))) - Integer.parseInt(String.valueOf(s.charAt(0)))));
		return Integer.parseInt(res.toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		System.out.println(modifyNumber(num));
		sc.close();
	}
}
