package com.lab3;
import java.util.*;

public class Exercise3 {
	
	static Boolean checkVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
	    && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'
	    && ch != 'U') {
			return false;
		}
		return true;
	}
	
	static String replaceConsonants(char[] s) {
		for(int i = 0; i < s.length; i++) {
			if (!checkVowel(s[i])) {
				if( s[i] == 'z') {
					s[i] = 'b';
				}else if( s[i] == 'Z') {
					s[i] = 'B';
				}else {
					s[i] = (char)(s[i] + 1);
				}
				
				//To get consonant if conversion is to vowel. Eg: d -> e => d -> f
				if(checkVowel(s[i])){
					s[i] = (char)(s[i] + 1);
				}
			}
		}
		return String.valueOf(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String str = sc.next();
		
		System.out.println(replaceConsonants(str.toCharArray()));
		sc.close();
	}
}
