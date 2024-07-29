package com.mycompany.ch03.tr;

public class IncreaseDereaseOperatorTr {

	public static void main(String[] args) {

		// 증감 연산자
		
		int i = 7;
		int j = 8;
		
		++i;	
		j++;
		
		// i = 1, j = 1
		// i = 8, j = 9
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("-----------------");
		
		int k = i++;
		int m = ++j;
		
		// k = 1, i = 2, m = 2, j = 2
		// k = 8, i = 9, m = 10, j = 10
		System.out.println("k : " + k);
		System.out.println("i : " + i);
		System.out.println("m : " + m);
		System.out.println("j : " + j);
		System.out.println("-----------------");
		
		--i;
		
		// i = 1
		// i = 8

		int z = ++i + j++;
		
		// z = 4, i = 2, j = 3
		// z = 19, i = 9, j = 11
		System.out.println("z : " + z);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("-----------------");
		
		
		
		
	}

}
