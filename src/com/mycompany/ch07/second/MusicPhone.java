package com.mycompany.ch07.second;

public class MusicPhone extends Phone{
	// 필드
	
	// 메서드
//	void sendCall() {
//		System.out.println("전화걸기");
//	}
//	void receiveCall() {
//		System.out.println("전화받기");
//	}
//	void connection() {
//		System.out.println("무선 기지국 연결");
//	}
//	void batteryCharge() {
//		System.out.println("배터리 충전하기");
//	}
	void musicDownload() {
		System.out.println("음악 다운받기");
	}
	void playMusic() {
		System.out.println("음악재생하기");
	}
	
	// 부모 클래스의 내용 오버라이드
	@Override
	void sendCall() {
		System.out.println("전화걸기");
	}
	@Override
	void receiveCall() {
		System.out.println("전화받기");
	}
	@Override
	void connection() {
		System.out.println("무선 기지국 연결");
	}
	@Override
	void batteryCharge() {
		System.out.println("배터리 충전하기");
	}

	
}
