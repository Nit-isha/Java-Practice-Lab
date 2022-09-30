package com.lab6;
import java.util.*;

public class Exercise2 {
	
	public static HashMap<Character, Integer> countChars(char[] arr){
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for (char c : arr) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}
			else {
				charCount.put(c, 1);
			}
		}
		return charCount;
	}

	public static void main(String[] args) {
		String s = "My Name Is Nitisha Gupta.";
		char arr[] = s.toCharArray();

		System.out.println(countChars(arr));
	}
}
