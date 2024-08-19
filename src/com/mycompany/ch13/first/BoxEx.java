package com.mycompany.ch13.first;

public class BoxEx {

	public static void main(String[] args) {

//		 Box box = new Box();
//		 
//		 box.setA("asdfasdf");	
//		 box.setA(10);			// 데이터 타입이 지정되어 있어서 불가능
		
		
		Box<String> box = new Box<>();
		box.setT("asdfasdf");
		System.out.println(box.getT());
		
		System.out.println("-----------------------");
		
		Box<Integer> box2 = new Box<>();
		box2.setT(10);
		System.out.println(box2.getT());
		
	}

}
