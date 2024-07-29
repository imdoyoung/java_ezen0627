package com.mycompany.ch03;

public class IncreaseDereaseOperatorEx2 {

	public static void main(String[] args) {

//		증감 연산자
		
		int i = 7;
		int j = 8;
		
		++i;
		j++;
		
//		i = 1, j = 1
//		i = 8, j = 9
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("------------------------");
		
		int k = i++;
		int m = ++j;
		
//		k = 1, i = 2, m = 2, j = 2
//		k = 8, i = 9, m = 10, j = 10
		
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		System.out.println("------------------------");
		
//		i = 9, i = 10
		
		--i;	// i = 8, j = 10
		int z = ++i + j++;	// z = 9 + 10 = 19
		
		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("------------------------");
		
	}

}
