package com.mycompany.ch15.second;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		// Map은 key-value 구조
		// Map은 add가 아닌 put이라는 함수를 사용한다.
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("임도영", 100);
		map.put("허경민", 100);
		map.put("정수빈", 100);
		map.put("김택연", 100);
//		map.put("임도영", "ㅁㄴㅇㅁㄴㅇㄹ");
		
		map.forEach((key, value)->{
			System.out.println(key + ":" + value);
		});
		
		System.out.println("------------------------");
		
		for(String strKey : map.keySet()) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey + ":" + strValue);
		}
	}

}
