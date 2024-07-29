package com.mycompany.ch03;

public class StringConcatEx7 {

	public static void main(String[] args) {

//		문자열 연산자 (+)
		
		String stringVal1 = "jdk ";
		String stringVal2 = "1.17";
		String stringVal5 = "10";
		
		String stringVal3 = stringVal1 + stringVal2;
		
		System.out.println("stringVal3: " + stringVal3);
		System.out.println("우리가 사용하는 jdk 버전은 " + stringVal3);
		
		int a = 1;
		
		String stringVal4 = stringVal1 + a;
		System.out.println("stringVal4: " + stringVal4);
		
		String stringVal6 = stringVal5 + a;
//		문자열로 저장된어 있는 stringVal5의 값 10을 정수형으로 변환하여 사용하려면 
//		int stringVal6 = Integer.parseInt(stringVal5) + a;
		System.out.println("stringVal6: " + stringVal6);				
	}

}
