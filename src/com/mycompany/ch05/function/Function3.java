package com.mycompany.ch05.function;

public class Function3 {

	public static void main(String[] args) {

		// 세 정수를 주면 최댓값을 반환하는 함수
		
		int maxN = maxNum(5, 2, 9);
		System.out.println(maxN);
	}
	
	public static int maxNum(int a, int b, int c) {
		int max = 0;
		if(a != b && b != c && a != c) {
			if(a > b && a > c) {
				max = a;
			} else if(b > a && b > c) {
				max = b;
			} else {
				max = c;
			}			
		} else {
//			by pass
		}
		return max;
	}

}
