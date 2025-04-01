package com.mycompany.test;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("6자리 양의 정수를 입력하세요.");
		
		int num = sc.nextInt();
		
		int[] arr = new int[6];
		
		for(int i = 5; i >= 0; i--) {
			arr[i] = num % 10;
			num = num / 10;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
