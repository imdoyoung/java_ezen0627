package com.mycompany.ch03;

public class CompareOperatorEx4 {

	public static void main(String[] args) {

//		비교 연산자 (==, !=, <, <=, >, >=)
		
		int a = 10;
		int b = 20;
		
		boolean result1 = (a == b);	// F
		System.out.println("result1: " + result1);
		boolean result2 = (a != b);	// T
		System.out.println("result2: " + result2);
		boolean result3 = (a < b);	// T
		System.out.println("result3: " + result3);
		boolean result4 = (a <= b);	// T
		System.out.println("result4: " + result4);
		boolean result5 = (a > b);	// F
		System.out.println("result5: " + result5);
		boolean result6 = (a >= b);	// F
		System.out.println("result6: " + result6);

	}

}
