package com.mycompany.ch12;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {

		// 빨간줄이 뜨면 단축키 [Ctrl + Shift + O]
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
