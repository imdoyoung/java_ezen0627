package com.mycompany.ch13.third;

public class BoxEx {

	public static void main(String[] args) {

		Box<String> box = new Box<>();
		
		Box<Integer> box2 = Util.boxing(100);
		
		Box<String> box3 = Util.boxing("asdf");
		
	}

}
