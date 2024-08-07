package com.mycompany.ch07.first.tr;

public class Member_tr {

	private String name;
	private int age;
	
	void aaa() {
		System.out.println(this.name);
		System.out.println(name);
	}
	
	// getter/setter
	public String GetName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public int GetAge() {
		return age;
	}
	public void SetAge(int age) {
		this.age = age;
	}
}
