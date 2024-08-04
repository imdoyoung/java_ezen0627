package com.mycompany.ch05.array;

public class Array {

	public static void main(String[] args) {

//		list를 이용한 배열 확인
		int[] scorechemistry = {100, 99, 98, 97, 96, 95, 94};
		
		int scorechemistry2[] = {100, 99, 98, 97, 96, 95, 94};
		
//		System.out.println("scorechemistry[0] : " + scorechemistry[0]);
//		System.out.println("scorechemistry[6] : " + scorechemistry[6]);
		
		// for문을 이용하여 배열에 저장된 데이터 다 출력하기
//		for(int i = 0; i < 7; i++) {
		for(int i = 0; i < scorechemistry.length; i++) {	//.length : 배열의 길이를 나타내는 내장객체
			System.out.println("scorechemistry[" + i + "] : " + scorechemistry[i] );
		}
		
		System.out.println("scorechemistry.length : " + scorechemistry.length);
		
		
		int[] scorechemistry3 = new int[7];
		
		int scorechemistry4[] = new int[7];
		
		// 비어있는 배열에 데이터 입력하기
		scorechemistry3[0] = 100;
		scorechemistry3[1] = 99;
		scorechemistry3[2] = 98;
		scorechemistry3[3] = 97;
		scorechemistry3[4] = 96;
		scorechemistry3[5] = 95;
		scorechemistry3[6] = 94;
		
		System.out.println("scorechemistry3.length : " + scorechemistry3.length);
		for(int i = 0; i < scorechemistry3.length; i++) {	//.length : 배열의 길이를 나타내는 내장객체
			System.out.println("scorechemistry3[" + i + "] : " + scorechemistry3[i] );
		}
		
		int i = 0;
		for(int a: scorechemistry3) {	// int a = scorechemistry3[0];	// 향상된 for문
			System.out.println("scorechemistry3[" + i + "] : " + a);
			i++;
		}

	}

}
