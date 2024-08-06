package com.mycompany.ch06.second;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		System.out.println("car.color: " + car.color);
		
		Car car2 = new Car("Black");
		System.out.println("car2.color: " + car2.color);
		
		Car car3 = new Car(12, "로마", "Red", "페라리");
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.company: " + car3.company);
		
		Car car4 = new Car(4, "그랜다이져", "White", "현대자동차");
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.name: " + car4.name);
		
		car4.name = "G80";
		System.out.println("car4.name: " + car4.name);		
	}

}
