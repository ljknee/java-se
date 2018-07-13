package com.kaunghtetaung.constructor;

public class Person {

	private String name;
	private String address;
	
	public Person() {
		System.out.println("Person : constructor is called!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
