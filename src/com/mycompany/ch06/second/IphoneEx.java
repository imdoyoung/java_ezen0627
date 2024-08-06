package com.mycompany.ch06.second;

public class IphoneEx {

	public static void main(String[] args) {
		
		Iphone iphone1 = new Iphone();
		
		System.out.println("iphone1.color : " + iphone1.color);
		
		Iphone iphone2 = new Iphone("블루 티타늄");
		System.out.println("iphone2.color : " + iphone2.color);
		
		Iphone iphone3 = new Iphone(128, "블랙 티타늄");
		System.out.println("iphone3.memory: " + iphone3.memory);
		System.out.println("iphone3.color: " + iphone3.color);
		
		Iphone iphone4 = new Iphone("5코어", 256, "핑크");
		System.out.println("iphone4.cpu: " + iphone4.cpu);
		System.out.println("iphone4.memory: " + iphone4.memory);
		System.out.println("iphone4.color: " + iphone4.color);
		
		iphone4.cpu = "6코어 cpu";
		System.out.println("iphone4.cpu: " + iphone4.cpu);
	}

}
