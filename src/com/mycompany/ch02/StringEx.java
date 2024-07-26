package com.mycompany.ch02;

public class StringEx {

	public static void main(String[] args) {

//		String은 큰따옴표를 사용해야한다.
//		작은따옴표는 오류가 발생한다.
		String var1 = "DoYoung";
//		String var2 = 'DoYoung';
		
		System.out.println("var1.toLowerCase(): " + var1.toLowerCase());
		
//		Integer는 null 허용, int는 null 미허용
		Integer var3 = 10;
		int var4 = 10;
	}

}
