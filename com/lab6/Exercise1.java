package com.lab6;

import java.util.*;

public class Exercise1 {
	
	public static ArrayList<String> getValues(HashMap<Integer, String> map) {
		ArrayList<String> list=new ArrayList<String>();
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			list.add(entry.getValue());
		}
		list.sort(null);
		return list;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1,"Aman");
		map1.put(2,"Ben");
		map1.put(3,"Carl");
		map1.put(4,"Ajay");
		
		System.out.println(getValues(map1));
	}
}
