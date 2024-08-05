package com.mycompany.ch06.first;

public class CarEx {

	public static void main(String[] args) {

//		클래스 클래스변수 = new 클래스생성자;
		Car car = new Car();
		
		System.out.println("car.engine : " + car.engine);
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("car.company : " + car.company);
		
		car.go();
		car.back();
	}

}
