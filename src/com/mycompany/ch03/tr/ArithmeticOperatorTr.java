package com.mycompany.ch03.tr;

public class ArithmeticOperatorTr {

	public static void main(String[] args) {

		// 산술 연산자
		
		int v1 = 5;
		int v2 = 2;
		int result = 0;
		
		result = v1 + v2; 	// 5 + 2
		System.out.println("result: " + result);	//	7
		
		result = v1 - v2;	// 5 - 2
		System.out.println("result: " + result);	// 3
		
		result = v1 * v2;	// 5 * 2
		System.out.println("result: " + result);	// 10
		
		result = v1 / v2;	// 5 / 2
		System.out.println("result: " + result);	// 2
		
		result = v1 % v2;	// 5 % 2
		System.out.println("result: " + result);	// 1
		
	}

}
