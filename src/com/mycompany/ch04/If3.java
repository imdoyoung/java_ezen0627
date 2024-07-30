package com.mycompany.ch04;

public class If3 {

	public static void main(String[] args) {

		// int 타입의 변수를 1개 선언하고
		// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오.
		
		int num = 98;
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
		} else {
			System.out.println(num + "은 홀수 입니다.");
		}
	}

}
