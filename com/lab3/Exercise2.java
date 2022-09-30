package com.lab3;
import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		StringBuffer s = new StringBuffer(sc.next());
		
		System.out.println(s+" | "+s.reverse());
		
		sc.close();
	}
}
