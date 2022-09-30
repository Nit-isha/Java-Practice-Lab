package com.degreePractice;
import java.util.*;

//Mobile Shop

class Mobile {
	
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile (String company, String model) {
		ArrayList<String> models = new ArrayList<String>();
		models.add(model);
		
		try {
			if (! (mobiles.containsKey(company))) {
				mobiles.put(company, models);
			}
			else {
				mobiles.get(company).add(model);
			}
			return "model successful added";
		} 
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<String> getModels (String company) {
		
		if (mobiles.containsKey(company)) {
			ArrayList<String> arr = mobiles.get(company);
			
			if(arr.size() == 1 && arr.get(0) == "") {
				return null;
			}
			else {
				return arr;
			}
		}
		else {
			return null;
		}
	}
	
	public String buyMobile (String company, String model) {
		if (mobiles.containsKey(company)) {
			ArrayList<String> arr = mobiles.get(company);
			
			if (arr.contains(model)) {
				arr.remove(model);
				return "mobile sold successfully";
			}
			else {
				return "item not available";
			}
		} 
		else {
			return "item not available";
		}
	}
}

public class Source2 {

	public static void main(String[] args) throws Exception {
		Mobile obj = new Mobile();
		
		String s1 = obj.addMobile("Oppo", "K3");
		String s2 = obj.addMobile("Oppo", "K2");
		obj.addMobile("Oppo", "K2");
		System.out.println(s1);
		System.out.println(s2);
		
		obj.addMobile("OnePlue", "Nord");
		obj.addMobile("Oppo", "K4");
		obj.addMobile("iPhone", "iPhone 13 pro");
		obj.addMobile("iPhone", "iPhone 13");
		
		ArrayList<String> s3 = obj.getModels("Oppo");
		System.out.println(s3);
		
		ArrayList<String> s4 = obj.getModels("iPhone");
		System.out.println(s4);
		
		String s5 = obj.buyMobile("iPhone", "iPhone 13");
		System.out.println(s5);
		
		String s6 = obj.buyMobile("Oppo", "K2");
		System.out.println(s6);
		
		String s7 = obj.buyMobile("Oppo", "K2");
		System.out.println(s7);
		
		String s8 = obj.buyMobile("Oppo", "K2");
		System.out.println(s8);
	}
}
