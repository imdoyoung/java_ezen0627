package com.mycompany.ch12;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {

//		방법1
//		Thread thread = new Thread(new Runnable() {
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
//		});
//		
//		thread.start();
		
//		방법2
		Runnable runnable = new BeepRunnable();
		Thread thread = new Thread(runnable);
		
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
