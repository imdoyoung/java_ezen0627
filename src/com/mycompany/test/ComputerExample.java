package com.mycompany.test;

public class ComputerExample {

	public static void main(String[] args) {
		System.out.println("원의 반지름 : 7");
		System.out.println("");
		
		Calculator calculator = new Calculator();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + calculator.CircleArea(7));
		System.out.println("");
		
		Computer computer = new Computer();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + computer.CircleArea(7));
	}

}
