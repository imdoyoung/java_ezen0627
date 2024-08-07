package com.mycompany.ch07.first.tr;

public class DmbCellPhone_tr extends CellPhone_tr {
	// child class
	// field
	public int channel;
	
	// method
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DBM를 틉니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방속 수신을 멈춥니다.");
	}
	void turnOffDmb(int a) {
		
	}
	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
	}
	
	
}
