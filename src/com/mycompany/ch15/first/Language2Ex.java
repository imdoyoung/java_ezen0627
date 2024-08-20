package com.mycompany.ch15.first;

import java.util.ArrayList;

public class Language2Ex {

	public static void main(String[] args) {

		ArrayList<Language> languages = new ArrayList<>();
		
		languages.add(new Language("Korean", 15));
		languages.add(new Language("USA", 16));
		languages.add(new Language("UK", 17));
		languages.add(new Language("Japan", 18));
		
		for(int i=0; i<languages.size(); i++) {
			System.out.println("i: " + i);
//			System.out.println(languages.get(i));
			System.out.println("languages.get(" + i + ").name: " + languages.get(i).name);
		}
		
		System.out.println("--------------------------------------");
		
		for(Language language : languages) {
			System.out.println("language.name: " + language.name);
		}
	}

}
