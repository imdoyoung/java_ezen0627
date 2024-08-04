package com.mycompany.ch05.function;

public class Function2 {

	public static void main(String[] args) {

		// 짝수인지 홀수인지 구별하는 함수
		// 정수를 입력하면 짝수/홀수를 출력
		String result = addEven(98);
		System.out.println(result);
		
	}
	
	public static String addEven(int a) {
		int num = a;
		String result;
		
		if(num % 2 == 0) {
			result = "짝수";
//			return "짝수";
		} else {
			result = "홀수";
//			return "홀수";
		}
		return result;
	}
	// 반환하는 변수 선언없이 바로 return 하려면 모든 케이스를 return 해줘야 한다.

}
