package com.mycompany.ch13.second;

public class Product<T, H> {

	private T kind;
	private H model;
	
//	----------------
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public H getModel() {
		return model;
	}
	public void setModel(H model) {
		this.model = model;
	}

}
