package com.mycompany.ch04;

public class While1 {

	public static void main(String[] args) {

		// 1부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("sum : " + sum);
	}

}
