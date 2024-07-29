package com.mycompany.ch03.tr;

public class ConditionalOperationTr {

	public static void main(String[] args) {

		// 삼항 연산자
		
		int math = 85;
		
		char grade = (math > 90) ? 'A' : 'B';
		
		System.out.println("grade: " + grade);	// B
		
		
		
		int v1 = 0;
		
		int result = (v1 == 0) ? 10 : 20;
		
		System.out.println("result: " + result);	// 10
		
	}

}
