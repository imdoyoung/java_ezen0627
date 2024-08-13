package com.mycompany.ch08;

public class TelevisionEx {

	public static void main(String[] args) {

//		인터페이스 객체 생성 불가
//		RemoteControl remoteControl = new RemoteControl();
//		
//		Television television = new Television();
//		
//		television.turnOn();
//		
//		SettopBox settopBox = new SettopBox();
//		
//		settopBox.turnOn();
		
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		
	}

}
