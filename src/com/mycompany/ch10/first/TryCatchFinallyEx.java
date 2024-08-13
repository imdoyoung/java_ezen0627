package com.mycompany.ch10.first;

public class TryCatchFinallyEx {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Extry");
			System.out.println("asdfgh");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
