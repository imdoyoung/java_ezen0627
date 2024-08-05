package com.mycompany.ch06.first;

public class Suv {

	// field
	int price = 115200000;
	String company = "VOLVO";
	String name = "XC90 Recharge";
	String color = "네이비";
	String type = "하이브리드";
	
	void go() {
		System.out.println("앞으로 가");
	}
	void ai() {
		System.out.println("NUGU~ 변우석 소나기 노래 틀어줘");
	}
	
//	연습문제1
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	void sum2(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	
//	연습문제 2
//	input : 문자열(사장, 부장, 과장, 대리, 사원, 나)
//	직급에 따른 연봉을 알려주는 함수
	public int salary(String grade) {
		int salary = 0;
		
		switch(grade) {
		case "사장" : {
			salary = 500000000;
			break;
		}
		case "부장" : {
			salary = 300000000;
			break;
		}
		case "과장" : {
			salary = 100000000;
			break;
		}
		case "대리" : {
			salary = 80000000;
			break;
		}
		case "사원" : {
			salary = 60000000;
			break;
		}
		case "나" : {
			salary = 150000000;
			break;
		}
		}
		
		return salary;
	}
}
