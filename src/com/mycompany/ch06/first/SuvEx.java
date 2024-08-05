package com.mycompany.ch06.first;

public class SuvEx {

	private static String grade;

	public static void main(String[] args) {

		Suv suv = new Suv();
		System.out.println("suv.price: " + suv.price);
		System.out.println("suv.company: " + suv.company);
		System.out.println("suv.name: " + suv.name);
		System.out.println("suv.color: " + suv.color);
		System.out.println("suv.type: " + suv.type);
		
		suv.go();
		
		suv.ai();
		
		// 연습문제1
		int sumsum = suv.sum(5, 7);
		System.out.println(sumsum);
		
		System.out.println(suv.sum(5, 7));
		
		suv.sum2(4, 6);
		
		// 연습문제2
		int pay = suv.salary("나");
		System.out.println("나의 연봉은 : " + pay + "원 입니다");
	}

}
