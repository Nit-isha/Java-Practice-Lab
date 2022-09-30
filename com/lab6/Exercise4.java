package com.lab6;
import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		HashMap<Integer, Float> map = new HashMap<Integer, Float>();
		
		map.put(1101, 84.3f);
		map.put(1102, 84.1f);
		map.put(1103, 73f);
		map.put(1104, 95.9f);
		map.put(1105, 99.9f);
		map.put(1106, 75f);
		map.put(1107, 35f);
		map.put(1108, 65f);
		map.put(1109, 25.1f);
		
		System.out.println(getStudents(map));
	}

	private static HashMap<Integer,String> getStudents(HashMap<Integer, Float> map) {
		
		HashMap<Integer,String> result = new HashMap<Integer,String>();
		
		for(Map.Entry<Integer, Float> entry : map.entrySet()) {
			if (entry.getValue() > 90) {
				result.put(entry.getKey(), "Gold");
			}
			else if (entry.getValue() > 80){
				result.put(entry.getKey(), "Silver");
			}
			else if (entry.getValue() > 70){
				result.put(entry.getKey(), "Bronze");
			}
			else {
				continue;
			}
		}
		return result;
	}

}
