package com.lab2;
import java.util.*;

public class Exercise3 {
	
	static int[] getSorted(int[] arr) {
		
		for (int i = 0; i< arr.length; i++) {
			int res = 0;
			int num = arr[i];
			
			while(num > 0) {
				int rem = num%10;
				res = res*10 + rem;
				num /= 10;
			}
			arr[i] = res;
		}
		Arrays.sort(arr);
		
		return arr;
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
		
		int result[] = getSorted(arr);
		for(int i = result.length - 1; i >= 0; i--) {
			System.out.print(result[i]+" ");
		}
		
		sc.close();

	}

}
