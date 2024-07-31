package com.mycompany.ch04;

public class For1 {

	public static void main(String[] args) {

		for(int a = 1; a <= 3; a++) {
			System.out.println("a : " + a);
		}
		System.out.println("---------------------");
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("i : " + i);
		}
		System.out.println("---------------------");
		
		
		// 2단 부터 출력되는 구구단 프로그램을 작성하시오.
		// 각 단계마다 구분선을 넣어 주세요.
		for(int j = 2; j <= 9; j++) {
			for(int k = 1; k <= 9; k++) {
				System.out.println(j + " * " + k + " = " + j*k);
			}
			if(j != 9) {
				System.out.println("---------------------");
			} else {
//				by pass
			}
		}
	}

}
