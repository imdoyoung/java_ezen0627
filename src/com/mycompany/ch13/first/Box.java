package com.mycompany.ch13.first;

public class Box<T> {
	
//	private String a;	// 객체 생성 후 변수에 접근이 불가능 하다.
//	public String b;	// 객체 생성 후 변수에 접근이 가능 하다.
//	
//	
//	public String getA() {
//		return a;
//	}
//	public void setA(String a) {
//		this.a = a;
//	}

	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
