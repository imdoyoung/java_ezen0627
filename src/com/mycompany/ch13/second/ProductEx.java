package com.mycompany.ch13.second;

public class ProductEx {

	public static void main(String[] args) {

		Product<String, Integer> product = new Product<>();
		
		product.setKind("Doyoung");
		product.setModel(100);
		
		Product<Tv, String> product2 = new Product<>();
	}

}
