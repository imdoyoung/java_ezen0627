package com.mycompany.ch03.tr;

public class StringConcatTr {

	public static void main(String[] args) {

		// 문자열 연산자
		
		String st1 = "jdk ";
		String st2 = "1.17";
		String st3 = st1 + st2;
		System.out.println("st3 : " + st3);
		
		int a = 1;
		String st4 = st1 + a;
		System.out.println("st4 : " + st4);
		
		String st5 = "10";
		String st6 = st5 + a;
		System.out.println("st6 : " + st6);
	}

}
