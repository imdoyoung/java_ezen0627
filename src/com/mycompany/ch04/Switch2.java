package com.mycompany.ch04;

public class Switch2 {

	public static void main(String[] args) {

		// 사장, 부장, 과장, 대리, 주임, 사원, 나
		// 사장의 연봉은 얼마 입니다.
		
		String position = "대리";
		
		switch (position){
		case "사장" : {
			System.out.println("연봉은 15,000만원 입니다.");
			break;
		}
		case "부장" : {
			System.out.println("연봉은 12,500만원 입니다.");
			break;			
		}
		case "과장" : {
			System.out.println("연봉은 10,000만원 입니다.");
			break;
		}
		case "대리" : {
			System.out.println("연봉은 8,000만원 입니다.");
			break;
		}
		case "주임" : {
			System.out.println("연봉은 7,000만원 입니다.");
			break;
		}
		case "사원" : {
			System.out.println("연봉은 5,000만원 입니다.");
			break;
		}
		case "나" : {
			System.out.println("연봉은 6,000만원 입니다.");
			break;
		}
		default : {
			System.out.println("없는 position 입니다. 다시 입력해 주세요.");
			break;
		}
		}
	}

}
