package com.degreePractice;

class Activity {
	String string1;
	String string2;
	String operator;
	
	public Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
}


public class Source3 {
	
	public String handleException (Activity a) {
		try {
			if (a.string1 != null && a.string2 != null) {
				
			}
			else {
				throw new NullPointerException();
			}
			
		} 
		catch (NullPointerException e) {
			return "Null values found";
		}
		
		
		try {
			if (a.operator != "+" && a.operator != "-") {
				throw new Exception();
			}
		} 
		catch (Exception e) {
			return a.operator;
		}
		
		return "No Exception Found";
	}
	
	public String doOperation (Activity a) {
		
		switch(a.operator) {
			case "+":
				return a.string1 + a.string2;
				
			case "-":
				return a.string1.replace(a.string2, "");
				
			default:
				return null;	
		}
	}

	public static void main(String[] args) {
		Source3 obj = new Source3();
		
		Activity a1 = new Activity("Hello", " World", "+");
		Activity a2 = new Activity("HelloWorld", "World", "-");
		Activity a3 = new Activity("HelloWorld", "Wor", "-");
		Activity a4 = new Activity("Hello", " World", "*");
		Activity a5 = new Activity("Hello", " World", "/");
		
		System.out.println(obj.doOperation(a1));
		System.out.println(obj.doOperation(a2));
		System.out.println(obj.doOperation(a3));
		System.out.println(obj.doOperation(a4));
		System.out.println(obj.doOperation(a5));
		
		System.out.println("-------");
		
		Activity a6 = new Activity("Hey", null, "+");
		Activity a7 = new Activity("Hey", "How are you?", "-");
		Activity a8 = new Activity("Hey", "How are you?", "*");
		Activity a9 = new Activity(null, null, "+");
		Activity a10 = new Activity(null, "Hey", "+");
		Activity a11 = new Activity(null, "Hey", "*");
		
		System.out.println(obj.handleException(a6));
		System.out.println(obj.handleException(a7));
		System.out.println(obj.handleException(a8));
		System.out.println(obj.handleException(a9));
		System.out.println(obj.handleException(a10));
		System.out.println(obj.handleException(a11));

	}

}
