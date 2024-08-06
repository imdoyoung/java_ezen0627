package com.mycompany.ch06.second;

public class Iphone {
	// field
	String cpu;
	int memory;
	String color;
	
	Iphone(){
		
	}
	
	Iphone(String color){
		this.color = color;
	}
	
	Iphone(int memory, String color){
		this.memory = memory;
		this.color = color;
	}
	
	Iphone(String cpu, int memory, String color){
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;
	}

}
