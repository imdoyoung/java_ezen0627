package com.mycompany.test;

import java.util.Scanner;

public class Solution2 {
	
	public int solution(int money) {
		int sharpPrice = 900;
		int bolpenPrice = 700;
		int pencilPrice = 500;
		
		int mincharge = money;
		
		int maxsharp = money / sharpPrice;
		int maxbolpen = 0;
		int maxpencil = 0;
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("가진 금액을 입력하세요: ");
	    int money = scanner.nextInt();
	    scanner.close();
		
		Solution2 sol = new Solution2();
		
		System.out.println(sol.solution(money));
	}

}
