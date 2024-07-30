package com.mycompany.ch04;

public class If2 {

	public static void main(String[] args) {

		// 일반 : 1, 5% 할인 적용
		// 브론즈 : 2, 10% 할인 적용
		// 실버 : 3, 15% 할인 적용
		// 골드 : 4, 20% 할인 적용
		// 플래티넘 : 5, 2.7% 할인 적용
		
		// 정가가 12000원인 실버 등급의 할인가는 10200원 입니다.
		
		int grade = 3;
		int cost = 12000;
		
		double salesCost = 0.0;
		
		double resultCost = 0;
		
		if(grade == 1) {
			salesCost = 0.95;
//			salesCost = cost * (1-0.05);
			resultCost =cost * salesCost;
//			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int)salesCost + "원 입니다.");
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int)resultCost + "원 입니다.");
		} else if (grade == 2) {
			salesCost = 0.9;
			resultCost =cost * salesCost;
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int)resultCost + "원 입니다.");
		} else if (grade == 3) {
			salesCost = 0.85;
			resultCost =cost * salesCost;
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int)resultCost + "원 입니다.");
		}
		else if (grade == 4) {
			salesCost = 0.8;
			resultCost =cost * salesCost;
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int)resultCost + "원 입니다.");
		}
		else if (grade == 5) {
			salesCost = 0.973;
			resultCost =cost * salesCost;
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int)resultCost + "원 입니다.");
		} else {
			
		}
	}

}
