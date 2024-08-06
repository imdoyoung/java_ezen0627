package com.mycompany.ch06.third;

public class Arithmetic {
	// 사칙연산 함수 생성 (+, -, *, /, %)
	
	//field
	int a;
	int b;
	int sum;
	int minus;
	int multiply;
	int divide;
	int remain;
	
	// method
	void sum(int a, int b) {
		sum = a + b;
		System.out.println("sum: " + sum);
	}
	
	void minus(int a, int b) {
		minus = a - b;
		System.out.println("minus: " + minus);
	}

	void multiply(int a, int b) {
		multiply = a * b;
		System.out.println("multiply: " + multiply);
	}
	
	void divide(int a, int b) {
		divide = a / b;
		System.out.println("divide: " + divide);
	}
	
	void remain(int a, int b) {
		remain = a % b;
		System.out.println("remain: " + remain);
	}
	

}
