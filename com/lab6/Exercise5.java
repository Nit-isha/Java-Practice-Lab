package com.lab6;
import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,5,2,3,46,8,6,53};
		
		System.out.println(getSecondSmallest(arr));
	}

	private static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> res = new ArrayList<Integer>(arr.length);
		
		for (int num : arr) {
			res.add(num);
		}
		
		res.sort(null);
		return res.get(1);
	}
}
