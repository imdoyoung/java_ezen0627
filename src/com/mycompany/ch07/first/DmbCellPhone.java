package com.mycompany.ch07.first;

public class DmbCellPhone extends CellPhone{

	// child class
	
	// 필드
	public int channel;
	
	// 메소드
	void turnOnDmb() {
//		powerOn();
		System.out.println("채널 " + channel + "번 DMB 켭니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	void turnOffDmb(int a) {
		
	}
	
//	void powerOn() {
//		System.out.println("자식의 전원을 켭니다.");
//	}
	
	@Override
	void powerOn(int a) {
		System.out.println("자식의 전원을 켭니다.");
	}
	
}
