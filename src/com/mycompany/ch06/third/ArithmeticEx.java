package com.mycompany.ch06.third;

public class ArithmeticEx {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		System.out.println("arithmetic.a: " + arithmetic.a);
		System.out.println("arithmetic.b: " + arithmetic.b);
		
		arithmetic.sum(10, 3);
		arithmetic.minus(10, 3);
		arithmetic.multiply(10, 3);
		arithmetic.divide(10, 3);
		arithmetic.remain(10, 3);
		
	}

}
