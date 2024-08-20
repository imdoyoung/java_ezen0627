package com.mycompany.ch15.first;

public class Language {
	
	public String name;
	public int version;
	
	// 명시적 생성자
	// 명시적 생성자가 있으면 객체가 기본으로 만들어진다.
	Language(String name, int version){
		this.name = name;
		this.version = version;
	}

}
