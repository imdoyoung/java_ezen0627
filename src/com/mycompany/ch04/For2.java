package com.mycompany.ch04;

public class For2 {

	public static void main(String[] args) {

		// 1부터 10까지 더하는 프로그램 작성
		int sum1 = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum1 += i;
//			System.out.println(i + " : " + sum1);
		}
		System.out.println("1~10까지의 합 : " + sum1);
		
		
		// 11~50까지 짝수의 합을 구하시오
		int sum2 = 0;
		
		for(int i = 11; i <= 50; i++) {
			if(i % 2 == 0) {
				sum2 += i;
//				System.out.println(i + " : " + sum2);
			} else {
//				by pass
			}
		}
		System.out.println("11~50까지 짝수들의 합 : " + sum2);
	}

}
