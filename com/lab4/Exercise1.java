package com.lab4;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Person{
	private String name;
	private float age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}


class Account extends Person{
	long accNum;
	private double balance;
	Person accHolder; 
	
}
