package com.mycompany.ch02;

public class CharEx {

	public static void main(String[] args) {

//		Java는 기호타입을 따진다.
//		char는 작은따옴표를 쓰는 것이 일반적이다.
//		큰 따옴표를 사용하면 오류가 발생한다.
//		char는 한글자만 입력받는다.
//		여러글자를 입력하면 오류가 발생한다.
		
		char var1 = 'A';
//		char var2 = "A";
//		char var3 = 'asdf';
		
		
		char var4 = 'A';
		
//		10진수 저장
//		char는 숫자를 입력하면 10진수로 인식한다.
		char var5 = 65;	 
		
//		16진수 저장
		char var6 = '\u0041';
		
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
	}

}
