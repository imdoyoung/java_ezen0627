package com.mycompany.ch07.third;

public class Student extends People{
	// 생성자 안에서 사용하는 super : 상위 클래스를 의미
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		
//		this.name = name;
//		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
//		super();
	}

	@Override
	void sayName() {
		super.sayName();
	}
	
	
	

}
