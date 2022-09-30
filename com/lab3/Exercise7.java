package com.lab3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise7 {
	
	static int[] getDuration(String inputDate) {
		int result[] = new int[3];
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String presentDate = dateFormat.format(date);
		
		StringTokenizer input = new StringTokenizer(inputDate, "/");
		StringTokenizer present = new StringTokenizer(presentDate, "/");
		
		int i = 0;
		while(input.hasMoreTokens()) {
			int then = Integer.parseInt(input.nextToken());
			int now = Integer.parseInt(present.nextToken());
			result[i] = Math.abs(now - then);
			i++;
		}
		return result;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String (DD/MM/YYYY) : ");
		
		String inputDate = sc.next();
		
		int arr[] = getDuration(inputDate);
		
		System.out.println("Number of Days : "+arr[0]);
		System.out.println("Number of Months : "+arr[1]);
		System.out.println("Number of Years : "+arr[2]);
	
		sc.close();
	}
}
