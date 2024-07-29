package com.mycompany.ch03;

public class LogicalOperatorEx5 {

	public static void main(String[] args) {

//		논리연산자 (&, &&, |, ||, ^)
//		&& = & : and : 논리곱 : 연산 참 참 참, 나머지 거짓
//		|| = | : or : 논리합 : 연산 참 거짓 참, 거짓 참 참, 참 참 참, 거짓 거짓 거짓
//		^ : 배타적 논리합 : 연산 참 참 거짓, 거짓 거짓 거짓, 참 거짓 참, 거짓 참 참
		
		int a = 65;
		
		if(a >= 65 & a <= 70) {	// 둘 다 참이어야지 True
			System.out.println("& : True");
		}
		
		if(a >= 65 && a <= 70) {	// 둘 다 참이어야지 True
			System.out.println("&& : True");
		}
		
		if(a > 65 | a <= 70) {	// 둘 중 하나만 참이여도 True
			System.out.println("| : True");
		}
		
		if(a > 65 || a <= 70) {	// 둘 중 하나만 참이여도 True
			System.out.println("|| : True");
		}
		
		if(a > 65 ^ a <= 70) {	// 둘 중 하나만 참이여야지 True
			System.out.println("^1 : True");
		}
		
	}

}
