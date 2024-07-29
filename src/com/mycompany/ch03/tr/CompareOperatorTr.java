package com.mycompany.ch03.tr;

public class CompareOperatorTr {

	public static void main(String[] args) {

		// 비교 연산자
		
		int a = 10;
		int b = 20;
		boolean result;
		
		result = (a == b);
		System.out.println("result: " + result);	// F
		
		result = (a != b);
		System.out.println("result: " + result);	// T
		
		result = (a < b);
		System.out.println("result: " + result);	// T
		
		result = (a <= b);
		System.out.println("result: " + result);	// T
		
		result = (a > b);
		System.out.println("result: " + result);	// F
		
		result = (a >= b);
		System.out.println("result: " + result);	// F
	}

}
