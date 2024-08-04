package com.mycompany.ch05.function;

public class Function4 {

	public static void main(String[] args) {
		// 정수
		// 100 이내의 자연수에서 선택된 수만큼 합산
		
		int sumN = sum(10);
		System.out.println(sumN);
		
	}
	
	public static int sum(int a) {
		int total = 0;
		if(a >= 1 && a <= 100) {
			for(int i = 1; i <= a; i++) {
				total += i;
			}			
		} else {
//			by pass
		}
		
		return total;
	}

}
