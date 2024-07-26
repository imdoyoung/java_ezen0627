package com.mycompany.ch02;

public class FloatDoubleEx {

	public static void main(String[] args) {

//		float보다는 double을 더 많이 사용한다.(범위도 double이 더 크다.)
		
		float var1 = 3.14f;
		
		double var2 = 3.14;
		
//		정밀도 테스트
		double var3 = 0.1234567890123456789;
		double var4 = 0.1234567890123456789F;
		
		System.out.println(var1);
		System.out.println(var2);
		
		System.out.println(var3);	
		System.out.println(var4);
		
	}

}
