package com.lab1;
import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the range for all Prime Numbers : ");
		int range = sc.nextInt();
		
		for (int i = 1; i <= range; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					count += 1;
				}
			}
			
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
}
