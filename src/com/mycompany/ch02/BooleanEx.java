package com.mycompany.ch02;

public class BooleanEx {

	public static void main(String[] args) {

		// boolean의 변수명을 선언할 때는 이름 앞에 is를 붙이는 것이 관례이다.
		// 선언
		Boolean isStop;	
		
		// 할당
		// boolean의 값은 소문자로 true/false만 가능하다.
		isStop = false;
		
		if(isStop) {	// 참이면
			System.out.println("true");
		} else {		// 거짓이면
			System.out.println("false");
		}
	
	}

}
