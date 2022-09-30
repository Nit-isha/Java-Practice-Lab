package com.lab6;
import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> details = new HashMap<Integer,Integer>();
		
		details.put(1001, 23);
		details.put(1002, 18);
		details.put(1003, 12);
		details.put(1004, 28);
		details.put(1005, 40);
		details.put(1006, 55);
		details.put(1007, 15);
		details.put(1008, 5);
		details.put(1009, 19);
		details.put(1010, 17);
		
		System.out.println(votersList(details));
	}

	private static ArrayList<Integer> votersList(HashMap<Integer, Integer> details) {
		ArrayList<Integer> isEligible = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, Integer> entry : details.entrySet()) {
			if (entry.getValue() >= 18) {
				isEligible.add(entry.getKey());
			}
		}
		return isEligible;
	}
}
