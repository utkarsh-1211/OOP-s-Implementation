package com.oopslearning.www;

public class Student {
	String name;
	int age;
	int rollNumber;
	String collage;
	
	
	//constructor chaining
	
	Student() {
		this("Unknown");
		
	} 
	Student(String name){
		this(name, 0);
		
	}
	Student(String name, int age){
		this(name, age, 0);
	}
	Student(String name, int age, int rollNumber){
		this(name, age, 0, "Unknown");
	}

	Student(String name, int age, int rollNumber, String collage) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.collage =  collage;
		
	}

}
