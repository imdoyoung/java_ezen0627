package com.mycompany.ch06.ninth;

public class MemberEx {

	public static void main(String[] args) {

		Member member = new Member();
		
//		member.name = "Doyoung";
		member.setName("Doyoung");
		
//		member.age = 25;
		member.setAge(25);
		
//		System.out.println("member.name: " + member.name);
		System.out.println("member.name: " + member.getName());
		System.out.println("member.name: " + member.getAge());
		
		
	}

}
