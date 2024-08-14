package com.mycompany.ch12.tr;

import java.awt.Toolkit;

public class BeepPrintThreadEx {
	public static void main(String[] args) {
		// 방법1
//		Thread thread = new Thread(new Runnable(){
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		});
//		
//		thread.start();
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("Doyoung");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		// 방법2
		// BeepRunnable클래스 생성 후 객체 생성
		Runnable runnable = new BeepRunnable();
		Thread thread = new Thread(runnable);
		
		// thread를 통해 runnable를 실행시켜 
		// 비프음을 발생시키는 메소드를 사용한다.
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Doyoung");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
