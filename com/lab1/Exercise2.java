package com.lab1;
import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your choice [RED | YELLOW | GREEN] : ");
		String input = sc.next();
		
		switch(input) {
		case "RED":
			System.out.println("STOP");
			break;
			
		case "YELLOW":
			System.out.println("READY");
			break;
			
		case "GREEN":
			System.out.println("GO");
			break;
			
		default:
			System.out.println("Invalid Input");
		
		}
		sc.close();
	}
}
