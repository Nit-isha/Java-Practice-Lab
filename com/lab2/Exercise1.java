package com.lab2;
import java.util.*;

public class Exercise1 {
	
	static int getSecondSmallest(int[] arr) {
		
		Arrays.sort(arr);
		return arr[arr.length - 2];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a length of Array : ");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		
		for(int i = 0; i < length; i++) {
			System.out.print("Enter "+(i+1)+"th element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Result : "+ getSecondSmallest(arr));
		
		sc.close();
	}

}
