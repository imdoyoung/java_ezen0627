package com.mycompany.ch13.third;

public class Util {
	// static은 객체를 생성하지 않아도 된다.
	// Box<T> : input
	public static <T> Box<T> boxing(T t) {

		Box<T> box = new Box<>();

		return box;
	}
}
