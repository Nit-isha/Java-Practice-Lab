package com.lab6;

import java.util.*;

public class Exercise7 {

	public static void main(String[] args) {
		int[] arr = new int[] {234,145,278,344,923,843,142,10};
		
		int[] reversedArray = getSorted(arr);
		
		for(int i = reversedArray.length - 1; i >= 0; i-- ) {
			
			System.out.print(reversedArray[i]+" ");
		}
	}

	private static int[] getSorted(int[] arr) {
		int[] res = new int[arr.length];
		int i = 0;
		
		for(int num : arr) {
			String number = String.valueOf(num);
			StringBuffer sb = new StringBuffer(number);
			String reversed = sb.reverse().toString();
			
			int reversedInt = Integer.parseInt(reversed);
			res[i] = reversedInt;
			i++;	
		}
		Arrays.sort(res);
		return res;
	}
}
