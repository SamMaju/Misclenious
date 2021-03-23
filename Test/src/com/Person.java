package com;

public class Person {

	private int phoneNumber;
	private String name;
	public Person(String name, int phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
