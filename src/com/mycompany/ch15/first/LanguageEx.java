package com.mycompany.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		
		// 객체 생성
		Language language1 = new Language("korean", 82);
		
//		System.out.println(language.name);
		
		// 이렇게 작성해도 문제는 없음. 하지만 올바른 방법은 아님.
//		ArrayList<Language> arrayList = new ArrayList<>();
		
		// 이게 정석인 방법. 리스트에 객체를 저장할 것임.
		List<Language> languages = new ArrayList<>();
		
//		language.add("asdf");	// error: language 객체를 넣어야 함
		languages.add(language1);
		
		Language language2 = new Language("USA", 10);
		Language language3 = new Language("Japan", 11);
		
		languages.add(language2);
		languages.add(language3);

		languages.add(new Language("England", 15));	
		
//		language.add(car);	// error: language 객체만 저장할 수 있음.
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("HYundai", 2000));
		cars.add(new Car("BMW", 2000));
		cars.add(new Car("KIA", 2000));
		
		for(int i=0; i<cars.size(); i++) {
//			System.out.println("i: " + i);
//			System.out.println(cars.get(i));
			System.out.println("cars.get(" + i + ").name: " + cars.get(i).getName());
		}
		
		// 향상된 for문
		for(Car car : cars) {
			System.out.println("car.name: " + car.getName());
		}
		
		
//		------------------------------------------------------
		// 리스트의 인덱스번호 3인 객체의 name을 England에서 UK로 변경
		languages.get(3).name = "UK";
		
		for(int i=0; i<languages.size(); i++) {
//			System.out.println("i: " + i);
//			System.out.println(languages.get(i));
			System.out.println("languages.get(" + i + ").name: " + languages.get(i).name);
		}
		
		System.out.println("---------------------");
		
//		향상된 for문 사용하기
//		for(데이터타입 변수명 : 콜렉션변수명){}
		for(Language language : languages) {
			System.out.println("language.name: " + language.name);
		}
				
	}

}
