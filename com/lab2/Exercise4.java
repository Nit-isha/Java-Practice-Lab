package com.lab2;

import java.util.*;

public class Exercise4 {
	
	static int[] modifyArray(int[] arr) {
		
		int noDuplicates[] = new int[arr.length];
		int i = 1;
		
		Arrays.sort(arr);
		noDuplicates[0] = arr[0]; 
		
		for (int j = 1; j < arr.length; j++) {
			if(arr[j] == arr[j-1]) {
				continue;
			}
			else {
				noDuplicates[i++] = arr[j];	
			}
		}
		return noDuplicates;
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
		
		int res[] = modifyArray(arr);
		
		for(int i = res.length - 1; i >= 0; i--) {
			System.out.print(res[i]+ " ");
		}
		
		sc.close();
	}
}
