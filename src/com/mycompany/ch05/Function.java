package com.mycompany.ch05;

public class Function {

	public static void main(String[] args) {
		
//		public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수 2, ...){
//			....
//			return 리턴값; // 리턴 자료형이 void인 경우에는 return 문이 필요 없다.
//			}

//		 int sum = 0;
//		 
//		 int a = 1;
//		 int b = 2;
//		 
//		 sum = a + b;
//		 
//		 System.out.println("sum : " + sum);
		
		int result1 = sum(3, 4);
		int result2 = sum(2, 6);
		System.out.println(result1);
		System.out.println(result2);
		
		
		say();
		
		String result3 = sayHello();
		System.out.println(result3);
		
		sum2(2, 6);
	}
	
	public static int sum (int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	public static void say () {	// void는 return이 없다. 입력값도 없다.
		System.out.println("Hi");
	}
	
	public static String sayHello() {
		return "Hello";
	}
	
	public static void sum2 (int a, int b) {
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}
	
}
