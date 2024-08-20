package com.mycompany.ch15.first;

public class Car {
	
	public String name;
	public int cc;
	
	Car(String name, int cc){
		this.name = name;
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}
