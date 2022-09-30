package com.degreePractice;
import java.util.*;

class ArrayListOps{
	public ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Collections.nCopies(n, 0));
		
		return arr;	
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		Collections.reverse(list);
		return list;	
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		Collections.replaceAll(list, m, n);
		return list;	
	}
}

public class Source1 {

	public static void main(String[] args) {
		ArrayListOps a = new ArrayListOps();
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,2,4,5,13));
		
		System.out.println(a.makeArrayListInt(5));
		System.out.println(a.reverseList(arr));
		System.out.println(a.changeList(arr, 13, 3));
	}
}
