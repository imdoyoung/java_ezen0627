package com.mycompany.ch06.ninth;

public class Member {
	
	private String name;
	private int age;
	
	void aaa() {
		System.out.println(this.name);
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
