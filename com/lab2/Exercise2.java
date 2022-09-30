package com.lab2;
import java.util.*;

public class Exercise2 {
	
	static String sortString(String str) {
		
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a length of String : ");
		int length = sc.nextInt();
		
		String str[] = new String[length];
		
		for(int i = 0; i < length; i++) {
			System.out.print("Enter "+(i+1)+"th element : ");
			str[i] = sc.next();
		}
		
		for(int i = 0; i < length; i++) {
			System.out.print(str[i] + " ");
//			str[i] = sc.next();
		}
		
//		System.out.println("Result : "+ sortString(str));
		
		sc.close();
		
	}

}
