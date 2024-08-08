package com.mycompany.ch07.third;

public class People {
	
	// 필드
	public String name;
	public String ssn;
	
	// 생성자
	// 부모에 생성자가 존재한다.
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	// 기본생성자
	public People() {
	}
	
	// 메서드
	void sayName() {
		System.out.println("People.name: " + name);
	}

}
