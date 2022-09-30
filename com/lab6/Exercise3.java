package com.lab6;

import java.util.*;

public class Exercise3 {
	
	public static HashMap<Integer, Integer> getSquares(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int num : arr) {
			map.put(num, num*num);
		}
		return map;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(getSquares(arr));
	}
}
