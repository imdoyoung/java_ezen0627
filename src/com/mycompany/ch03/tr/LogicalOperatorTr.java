package com.mycompany.ch03.tr;

public class LogicalOperatorTr {

	public static void main(String[] args) {

		// 논리 연산자
		
		int a = 65;
		
		if(a >= 65 & a <= 70) {		// T
			System.out.println("&: True");
		}
		
		if(a >= 65 && a <= 70) {	// T
			System.out.println("&&: True");
		}
		
		if(a > 65 | a <= 70) {		// T
			System.out.println("|: True");
		}
		
		if(a > 65 || a <= 70) {		// T
			System.out.println("||: True");
		}
		
		if(a > 65 ^ a <= 70) {		// T
			System.out.println("^: True");
		}
		
	}

}
