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
		if(age>18 && age<60) {
			return age;
		}
		else {
			return -1;
		}
		
	}
	public void setAge(int age) {
		this.age=age;
		
		
	}
	public int getMarks() {
		if(marks>0 && marks<500)
			return marks;
		else 
			return -1;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	//show method 
	public void showDetails(){
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		System.out.println("Age is:"+age);
		}
	
}

