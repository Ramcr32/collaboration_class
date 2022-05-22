package com.masai;
//first assignment
public class Separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using zero argument constructor
		Student student1 = new Student();
		student1.setRoll(100);
		student1.setName("Ram");
		student1.setAge(26);
		student1.setMarks(400);
		System.out.println("Student1 details: ");
		student1.showDetails();
		//using parameterized constructor
		Student student2 = new Student(101, "Ramesh", 65,850);
		System.out.println("Student2 details using getter methods");
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName());
		System.out.println("Age is :"+student2.getAge());
		System.out.println("Marks is :"+student2.getMarks());
		//
//		System.out.println("calling by second method");
//		student2.showDetails();
	}

}
