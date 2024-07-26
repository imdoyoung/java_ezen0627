package com.mycompany.ch02;

public class VariableEx {

//	상수 표기법
	int SOCIAL_SECURITY_NUMBER;

//	스네이크 표기법
	int social_security_number;

//	파스칼 표기법
	int SocialSecurityNumber;

//	카멜 표기법 : 변수, 상수
	int socialSecurityNumber;

	public static void main(String[] args) {

		// 변수명 대소문자 구분함
		int number = 1;
		int Number = 2;

		System.out.println(number + " : " + Number);

//	------------------------

		int a;
		int b = 1;
		int c = 0;

//	c = a + b;

//	------------------------
		
//		변수의 범위
//		변수는 선언된 블럭 내에서만 사용 가능하다.

		int d = 1;

		if (d == 1) {
			int aaa = 10;
			int bbb = aaa + d;
			System.out.println("bbb : " + bbb);
		} else {

		}

//		aaa, bbb를 출력하려고 하면 오류나는 이유 : 
//		aaa와 bbb는 if문 안에 선언한 변수 이기 때문에
//		if문 밖에서 사용하려고 하면 정의되지 않은 변수라 사용할 수 없다.
//		System.out.println("aaa : " + aaa);
//		System.out.println("bbb : " + bbb);
		System.out.println("d : " + d);

	}
}
