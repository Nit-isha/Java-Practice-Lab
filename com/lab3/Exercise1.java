package com.lab3;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the space separated integers : ");
		String s = sc.nextLine();
		
		StringTokenizer str = new StringTokenizer(s," ");
		
		int sum = 0;
		
		while (str.hasMoreTokens()) {
			String temp = str.nextToken();
			int num = Integer.parseInt(temp);
			sum += num;
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("Sum : "+sum);
		
		sc.close();
	}
}
