package com.mycompany.ch07.first.tr;

public class MemberEx_tr {

	public static void main(String[] args) {

		Member_tr member_tr = new Member_tr();
		
		member_tr.SetName("Im Doyoung");
		member_tr.SetAge(25);
		
		System.out.println(member_tr.GetName());
		System.out.println(member_tr.GetAge());
	}

}
