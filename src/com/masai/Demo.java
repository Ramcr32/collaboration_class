package com.masai;

public class Demo {
	String s;
	int i;
	float f;
	public Demo() {
		this("call constructor");
		System.out.println("zero argument constructor");
	}
	public Demo(String s) {
		this(10);
		System.out.println("String argument constructor");
	}
	public Demo(int i) {
		this(10.55f);
		System.out.println("int argument constructor");
	}
	public Demo(float f) {
		
		System.out.println("float argument constructor");
	}
	public static void main(String[] args) {
		new Demo();
	}
	
}
