package com.masai;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	//zero argument constructor
	public Student() {
		
	}
	//parameterized constructor
	public Student(int roll, String name, int age, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	//getter and setter
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;
		}
		
		
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	//show method 
	public void showDetails(){
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		System.out.println("age is:"+age);
		}
	
}

